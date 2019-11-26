package irvine.oeis.a013;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A013595 Irregular triangle read by rows: coefficients of cyclotomic polynomial <code>Phi_n(x)</code> (exponents in increasing order).
 * @author Sean A. Irvine
 */
public class A013595 implements Sequence {

  private Polynomial<Z> mCyclotomicPolynomial = Polynomial.create(0, 1);
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mCyclotomicPolynomial.degree()) {
      mCyclotomicPolynomial = Cyclotomic.cyclotomic(++mN);
      mM = 0;
    }
    return mCyclotomicPolynomial.coeff(mM);
  }
}
