package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008979 a(n) = (6n)!/(n!)^6.
 * @author Sean A. Irvine
 */
public class A008979 extends Sequence0 {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(6 * mN).multiply(6 * mN - 1).multiply(6 * mN - 2).multiply(6 * mN - 3).multiply(6 * mN - 4).multiply(6 * mN - 5)
        .divide(Z.valueOf(mN).pow(6));
    }
    return mF;
  }
}

