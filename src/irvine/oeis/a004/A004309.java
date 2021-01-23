package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004309 Hit polynomials, coefficient of y^2 in N_n(y).
 * @author Sean A. Irvine
 */
public class A004309 extends A004307 {

  private int mN = 3;

  @Override
  public Z next() {
    return hitPolynomial(++mN).coeff(2);
  }
}

