package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000138 Expansion of e.g.f. exp(-x^4/4)/(1-x).
 * @author Sean A. Irvine
 */
public class A000138 extends Sequence0 {

  private Z mA = Z.ONE;
  private int mN = -1;
  private boolean mSign = false;
  private Z mPowerFour = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return mA;
    }
    mA = mA.multiply(mN);
    if ((mN & 3) == 0 && mN > 0) {
      mPowerFour = mPowerFour.shiftLeft(2);
      final Z term = Functions.FACTORIAL.z(mN - 1)
        .multiply(mN)
        .divide(Functions.FACTORIAL.z(mN >> 2).multiply(mPowerFour));
      mA = mA.signedAdd(mSign, term);
      mSign = !mSign;
    }
    return mA;
  }
}

