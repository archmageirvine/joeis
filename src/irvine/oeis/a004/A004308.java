package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004308 Hit polynomials, coefficient of y in N_n(y).
 * @author Sean A. Irvine
 */
public class A004308 extends A004307 {

  private int mN = 3;

  @Override
  public Z next() {
    return hitPolynomial(++mN).coeff(1);
  }
}

