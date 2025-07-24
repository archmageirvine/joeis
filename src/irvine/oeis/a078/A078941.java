package irvine.oeis.a078;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A078941 Flipping burnt pancakes. Maximum number of spatula flips to sort a stack of n pancakes of different sizes, each burnt on one side, so that the smallest ends up on top, ..., the largest at the bottom and each has its burnt side down.
 * @author Sean A. Irvine
 */
public class A078941 extends Sequence1 {

  // Uses even numbers for unburnt side, and odd for the burnt side.

  private int mN = 0;
  protected int mMax = 0;
  protected LongDynamicLongArray mCounts;

  protected void step() {
    ++mN;
    mCounts = new LongDynamicLongArray();
    final HashMap<String, Integer> seen = new HashMap<>();
    final int[] perm = new int[mN];
    for (int k = 0; k < mN; ++k) {
      perm[k] = 2 * k;
    }
    seen.put(Arrays.toString(perm), 1); // Offset by 1, we use 0 to indicate not yet seen
    mCounts.increment(0);
    final Deque<int[]> queue = new LinkedList<>();
    queue.add(perm);
    mMax = 0;
    while (!queue.isEmpty()) {
      final int[] p = queue.pollFirst();
      mMax = seen.get(Arrays.toString(p));
      for (int k = 1; k <= p.length; ++k) { // exclusive end-point of reversal
        final int[] q = Arrays.copyOf(p, p.length);
        for (int j = 0, i = k - 1; i >= 0; ++j, --i) {
          q[j] = p[i] ^ 1; // ^ 1 swaps burnt to unburnt and vice versa
        }
        final String sq = Arrays.toString(q);
        if (!seen.containsKey(sq)) {
          seen.put(sq, mMax + 1);
          mCounts.increment(mMax);
          queue.add(q);
        }
      }
    }
  }

  @Override
  public Z next() {
    step();
    return Z.valueOf(mMax - 1);
  }
}
