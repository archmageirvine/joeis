package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000185 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A000185 extends A000159 {

  /** Construct the sequence. */
  public A000185() {
    super(5);
  }

  private int mA185 = 4;

  @Override
  public Z next() {
    return menageHitPolynomial(++mA185).coeff(5);
  }
}
