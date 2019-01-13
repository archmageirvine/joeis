package irvine.oeis.a004;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A004173.
 * @author Sean A. Irvine
 */
public class A004173 extends A004172 {

  private int mN = -2;
  private int mM = 0;
  private Polynomial<Q> mEulerPolynomial = null;

  @Override
  public Z next() {
    if (--mM < 0) {
      mN += 2;
      mEulerPolynomial = eulerPolynomial(mN);
      mM = mEulerPolynomial.degree();
    }
    return mEulerPolynomial.coeff(mM).toZ();
  }
}
