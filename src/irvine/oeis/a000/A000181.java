package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000181 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A000181 extends A000159 {

  private int mA181 = 3;

  @Override
  public Z next() {
    return menageHitPolynomial(++mA181).coeff(4);
  }
}
