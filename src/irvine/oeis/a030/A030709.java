package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A030709 Number of new terms at stage n in the formation of A030707.
 * @author Sean A. Irvine
 */
public class A030709 extends Sequence1 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private final DynamicLongArray mB = new DynamicLongArray();
  private final LongDynamicLongArray mTotals = new LongDynamicLongArray();
  {
    mA.set(0, initialTerm());
    mTotals.set(initialTerm(), 1L);
  }

  protected long initialTerm() {
    return 1;
  }

  @Override
  public Z next() {
    // Perform nth stage
    final long oldSize = mB.length();
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
    return Z.valueOf(mB.length() - oldSize);
  }
}
