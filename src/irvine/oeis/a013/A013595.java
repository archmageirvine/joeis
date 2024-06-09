package irvine.oeis.a013;

import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013595 Irregular triangle read by rows: coefficients of cyclotomic polynomial Phi_n(x) (exponents in increasing order).
 * @author Sean A. Irvine
 */
public class A013595 extends Sequence0 {

  private Polynomial<Z> mCyclotomicPolynomial = Polynomial.create(0, 1);
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mCyclotomicPolynomial.degree()) {
      mCyclotomicPolynomial = CyclotomicPolynomials.cyclotomic(++mN);
      mM = 0;
    }
    return mCyclotomicPolynomial.coeff(mM);
  }
}
