package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005041 A self-generating sequence.
 * @author Sean A. Irvine
 */
public class A005041 extends Sequence0 {

  private long mN = -1;
  private long mK = 0;
  private long mR = 1;
  private long mNext = 2;
  private Z mV = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= mNext) {
      mV = Z.valueOf(3 * mK + mR + 1);
      if (++mR > 2) {
        ++mK;
        mR = 0;
      }
      mNext = 6 * mK + 3 * mK * (mK - 1) / 2 + mR * (mK + 2);
    }
    return mV;
  }
}
