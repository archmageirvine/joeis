package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A030707 The first list after the following procedure: starting with a list [1] and an empty list, repeatedly add the distinct values already in both lists in ascending order to the second list and add the corresponding frequencies of those values to the first list.
 * @author Sean A. Irvine
 */
public class A030707 extends Sequence1 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private final DynamicLongArray mB = new DynamicLongArray();
  private final LongDynamicLongArray mTotals = new LongDynamicLongArray();
  private int mN = -1;
  {
    mA.set(0, initialTerm());
    mTotals.set(initialTerm(), 1L);
  }

  protected long initialTerm() {
    return 1;
  }

  protected long select(final long a, final long b) {
    return a;
  }

  @Override
  public Z next() {
    if (++mN >= mB.length()) {
      // Perform kth stage
      final long lim = mTotals.length();
      final LongDynamicLongArray oldTotals = mTotals.copy(); // because we are modifying this in the loop
      for (long j = 1; j < lim; ++j) {
        final long cnt = oldTotals.get(j);
        if (cnt != 0) {
          mA.set(mA.length(), cnt);
          mB.set(mB.length(), j);
          mTotals.set(cnt, mTotals.get(cnt) + 1);
          mTotals.set(j, mTotals.get(j) + 1);
        }
      }
    }
    return Z.valueOf(select(mA.get(mN), mB.get(mN)));
  }
}
