package irvine.oeis.a092;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A092113 Triangle read by rows: T(n,k) is the number of stacks of n pancakes requiring k = 0, ..., A058986(n) flips to sort.
 * @author Sean A. Irvine
 */
public class A092113 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected int mMax = 0;
  protected LongDynamicLongArray mCounts;

  // cf. http://www.geekviewpoint.com/java/numbers/permutation_index
  private long index(final int[] perm) {
    long index = 0;
    int pos = 2;
    long factor = 1;
    for (int k = perm.length - 2; k >= 0; --k) {
      int successors = 0;
      for (int q = k + 1; q < perm.length; ++q) {
        if (perm[k] > perm[q]) {
          ++successors;
        }
      }
      index += successors * factor;
      factor *= pos;
      ++pos;
    }
    return index;
  }

  protected void step() {
    ++mN;
    mCounts = new LongDynamicLongArray();
    final LongDynamicIntArray seen = new LongDynamicIntArray();
    final int[] perm = IntegerUtils.identity(new int[mN]);
    final long pi = index(perm);
    seen.set(pi, 1); // Offset by 1, we use 0 to indicate not yet seen
    mCounts.increment(pi);
    final Deque<int[]> queue = new LinkedList<>();
    queue.add(perm);
    mMax = 0;
    while (!queue.isEmpty()) {
      final int[] p = queue.pollFirst();
      mMax = seen.get(index(p));
      for (int k = 2; k <= p.length; ++k) { // exclusive end-point of reversal
        final int[] q = Arrays.copyOf(p, p.length);
        for (int j = 0, i = k - 1; i >= 0; ++j, --i) {
          q[j] = p[i];
        }
        final long idx = index(q);
        if (seen.get(idx) == 0) {
          seen.set(idx, mMax + 1);
          mCounts.increment(mMax);
          queue.add(q);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mMax) {
      step();
      mM = 0;
    }
    return Z.valueOf(mCounts.get(mM));
  }
}
