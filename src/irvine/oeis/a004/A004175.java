package irvine.oeis.a004;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A004175 Triangle of coefficients of Euler polynomials 2^n*E_n(x) (exponents in decreasing order).
 * @author Sean A. Irvine
 */
public class A004175 extends A004172 {

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mEulerPolynomial = null;

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      mEulerPolynomial = RING.multiply(eulerPolynomial(mN), new Q(Z.ONE.shiftLeft(mN)));
      mM = mEulerPolynomial.degree();
    }
    return mEulerPolynomial.coeff(mM).toZ();
  }
}
