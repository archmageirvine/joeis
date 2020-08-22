package irvine.oeis.a333;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A333867 Table with T(1,1) = 1; for n&gt;1, T(n,k) is the number of k's in rows 1 through n-1.
 * @author Sean A. Irvine
 */
public class A333867 implements Sequence {

  private final DynamicLongArray mA = new DynamicLongArray();
  private final DynamicLongArray mB = new DynamicLongArray();
  private final LongDynamicLongArray mTotals = new LongDynamicLongArray();
  private int mN = -1;
  {
    mA.set(0, 1L);
    mTotals.set(1, 1L);
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
        mA.set(mA.length(), cnt);
        mB.set(mB.length(), j);
        mTotals.set(cnt, mTotals.get(cnt) + 1);
      }
    }
    return Z.valueOf(select(mA.get(mN), mB.get(mN)));
  }
}
