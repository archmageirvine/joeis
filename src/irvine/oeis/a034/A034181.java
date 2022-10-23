package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034181 Numbers n with property that rotating digits of n right gives kn - 1 for some k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A034181 extends Sequence1 {

  private long mN = 13;
  private long mMul = 10;
  private long mLim = 100;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mMul = mLim;
        mLim *= 10;
      }
      final long t = mMul * (mN % 10) + (mN / 10) + 1;
      if (t >= mN && t % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

