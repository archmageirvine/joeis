package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034181 Numbers n with property that rotating digits of n right gives kn <code>- 1</code> for some k <code>&gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A034181 implements Sequence {

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

