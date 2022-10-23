package irvine.oeis.a028;

import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028297 Coefficients of Chebyshev polynomials of the first kind: triangle of coefficients in expansion of cos(n*x) in descending powers of cos(x).
 * @author Sean A. Irvine
 */
public class A028297 extends Sequence0 {

  private final ChebyshevPolynomials mChebyshevPolynomials = new ChebyshevPolynomials(1);
  private Polynomial<Z> mPoly = mChebyshevPolynomials.getValue(0);
  private int mN = 0;
  private int mM = 1;

  @Override
  public Z next() {
    while (true) {
      if (--mM < 0) {
        mPoly = mChebyshevPolynomials.getValue(++mN);
        mM = mPoly.degree();
      }
      final Z c = mPoly.coeff(mM);
      if (!c.isZero()) {
        return c;
      }
    }
  }
}

