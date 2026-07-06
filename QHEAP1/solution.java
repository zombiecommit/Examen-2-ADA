import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        while (q-- > 0) {

            int type = sc.nextInt();

            if (type == 1) {

                int value = sc.nextInt();
                heap.add(value);

            } else if (type == 2) {

                int value = sc.nextInt();
                heap.remove(value);

            } else {

                System.out.println(heap.peek());

            }

        }

        sc.close();
    }
}