package irvine.oeis.a078;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078942 Flipping burnt pancakes. Given a sorted stack of n burnt pancakes of different sizes (smallest on top, ..., largest at the bottom), each with its burnt side up, a(n) is the number of spatula flips needed to restore them to their initial order but with the burnt sides down.
 * @author Sean A. Irvine
 */
public class A078942 extends Sequence1 {

  // Uses even numbers for unburnt side, and odd for the burnt side.

  private int mN = 0;

  // Test for all burnt up in order
  private boolean is(final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      if (p[k] != 2 * k + 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final HashMap<String, Integer> seen = new HashMap<>();
    final int[] perm = new int[mN];
    for (int k = 0; k < mN; ++k) {
      perm[k] = 2 * k;
    }
    seen.put(Arrays.toString(perm), 1); // Offset by 1, we use 0 to indicate not yet seen
    final Deque<int[]> queue = new LinkedList<>();
    queue.add(perm);
    while (!queue.isEmpty()) {
      final int[] p = queue.pollFirst();
      final int max = seen.get(Arrays.toString(p));
      for (int k = 1; k <= p.length; ++k) { // exclusive end-point of reversal
        final int[] q = Arrays.copyOf(p, p.length);
        for (int j = 0, i = k - 1; i >= 0; ++j, --i) {
          q[j] = p[i] ^ 1; // ^ 1 swaps burnt to unburnt and vice versa
        }
        if (is(q)) {
          return Z.valueOf(max);
        }
        final String sq = Arrays.toString(q);
        if (!seen.containsKey(sq)) {
          seen.put(sq, max + 1);
          queue.add(q);
        }
      }
    }
    throw new RuntimeException();
  }
}
