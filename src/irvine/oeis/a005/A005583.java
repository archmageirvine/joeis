package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005583 Coefficients of Chebyshev polynomials.
 * @author Sean A. Irvine
 */
public class A005583 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.add(2)).multiply(mN.add(3)).multiply(mN.add(9)).divide(120);
  }
}

