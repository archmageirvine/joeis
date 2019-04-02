package irvine.oeis.a004;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A004174 Triangle of coefficients of Euler polynomials 2^n*E_n(x) (exponents in increasing order).
 * @author Sean A. Irvine
 */
public class A004174 extends A004172 {

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mEulerPolynomial = RING.zero();

  @Override
  public Z next() {
    if (++mM > mEulerPolynomial.degree()) {
      ++mN;
      mM = 0;
      mEulerPolynomial = RING.multiply(eulerPolynomial(mN), new Q(Z.ONE.shiftLeft(mN)));
    }
    return mEulerPolynomial.coeff(mM).toZ();
  }
}
