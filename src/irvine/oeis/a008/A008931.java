package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008931 Expansion of (2/(1+sqrt(1-36*x)))^(1/3).
 * @author Sean A. Irvine
 */
public class A008931 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(6).multiply(Z.valueOf(mN).multiply(18).subtract(21).multiply(mN).add(5))
        .divide(mN).divide(3 * mN + 1);
    }
    return mA;
  }
}
