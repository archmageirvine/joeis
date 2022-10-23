package irvine.oeis.a039;

import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039991 Triangle of coefficients of cos(x)^n in polynomial for cos(nx).
 * @author Sean A. Irvine
 */
public class A039991 extends Sequence0 {

  private final ChebyshevPolynomials mChebyshevPolynomials = new ChebyshevPolynomials(1);
  private Polynomial<Z> mPoly = mChebyshevPolynomials.getValue(0);
  private int mN = 0;
  private int mM = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mPoly = mChebyshevPolynomials.getValue(++mN);
      mM = mPoly.degree();
    }
    return mPoly.coeff(mM);
  }
}

