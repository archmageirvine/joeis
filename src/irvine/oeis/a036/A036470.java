package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A036470 a(n) is the number of distinct possible values of d(k), the number of divisors of k, among numbers k whose binary order (A029837) does not exceed n.
 * @author Sean A. Irvine
 */
public class A036470 extends A000040 {

  {
    setOffset(0);
  }

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 1;
  private long mCount = 0;
  private long mLim = 0;

  @Override
  public Z next() {
    mLim = mLim == 0 ? 1 : mLim * 2;
    while (mN <= mLim) {
      final long s0 = Functions.SIGMA0.z(mN).longValueExact();
      if (!mSeen.isSet(s0)) {
        mSeen.set(s0);
        ++mCount;
      }
      ++mN;
    }
    return Z.valueOf(mCount);
  }
}
