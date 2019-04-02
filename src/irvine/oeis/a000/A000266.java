package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000266 E.g.f. exp(-x^2/2) / (1-x).
 * @author Sean A. Irvine
 */
public class A000266 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mF = Z.ONE;
  private Z mK = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      mA = mA.multiply(mN);
      if ((mN & 1) == 0) {
        mF = mF.divide2();
        final int k = mN >> 1;
        if (k != 0) {
          mK = mK.multiply(k);
        }
        final Z t = mF.divide(mK);
        mA = mA.signedAdd((k & 1) == 0, t);
      }
    }
    return mA;
  }
}
