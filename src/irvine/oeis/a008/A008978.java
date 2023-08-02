package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008978 a(n) = (5*n)!/(n!)^5.
 * @author Sean A. Irvine
 */
public class A008978 extends Sequence0 {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(5L * mN).multiply(5L * mN - 1).multiply(5L * mN - 2).multiply(5L * mN - 3).multiply(5L * mN - 4)
        .divide(Z.valueOf(mN).pow(5));
    }
    return mF;
  }
}

