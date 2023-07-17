package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000425 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A000425 extends A000159 {

  /** Construct the sequence. */
  public A000425() {
    super(1);
  }

  private int mA425 = 0;

  @Override
  public Z next() {
    return menageHitPolynomial(++mA425).coeff(1);
  }
}
