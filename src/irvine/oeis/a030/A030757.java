package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A030757 Row 1, where, at stage <code>k&gt;1</code>, write i in row 1 and j in row 2, where i is the number of j's in rows 1 and 2, for <code>j=m,m-1,...2,1</code>, where <code>m=max</code> number in row 1 from stages 1 to <code>k-1;</code> stage 1 is 1 in row 1.
 * @author Sean A. Irvine
 */
public class A030757 implements Sequence {

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
      for (long j = lim - 1; j > 0; --j) {
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
