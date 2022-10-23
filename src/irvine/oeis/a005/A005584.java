package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005584 Coefficients of Chebyshev polynomials.
 * @author Sean A. Irvine
 */
public class A005584 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.add(2)).multiply(mN.add(3)).multiply(mN.add(4)).multiply(mN.add(11)).divide(720);
  }
}

