package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034180 Rotating digits right gives multiple of that number <code>+ 1</code>.
 * @author Sean A. Irvine
 */
public class A034180 implements Sequence {

  private long mN = 102;
  private long mMul = 100;
  private long mLim = 1000;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mMul = mLim;
        mLim *= 10;
      }
      final long t = mMul * (mN % 10) + (mN / 10) - 1;
      if (t >= mN && t % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

