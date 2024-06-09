package irvine.oeis.a013;

import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013596 Irregular triangle of coefficients of cyclotomic polynomial Phi_n(x) (exponents in decreasing order).
 * @author Sean A. Irvine
 */
public class A013596 extends Sequence0 {

  private Polynomial<Z> mCyclotomicPolynomial = Polynomial.create(0, 1);
  private int mN = 0;
  private int mM = 2;

  @Override
  public Z next() {
    if (--mM < 0) {
      mCyclotomicPolynomial = CyclotomicPolynomials.cyclotomic(++mN);
      mM = mCyclotomicPolynomial.degree();
    }
    return mCyclotomicPolynomial.coeff(mM);
  }
}
