package irvine.oeis.a083;

import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Z;

/**
 * A083350 Integer coefficients of a power series A(x) such that A(x)^3 = A083349(x).
 * @author Sean A. Irvine
 */
public class A083350 extends A083349 {

  @Override
  public Z next() {
    super.next();
    return PolynomialUtils.cubeRootP(RING.subtract(mA, RING.one()), mN).coeff(mN).toZ();
  }
}
