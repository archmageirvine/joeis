package irvine.oeis.a059;

import irvine.math.polynomial.EulerPolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059341 Triangle giving numerators of coefficients of Euler polynomials, highest powers first.
 * @author Sean A. Irvine
 */
public class A059341 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return EulerPolynomials.eulerPolynomial(mN).coeff(mN - mM).num();
  }
}
