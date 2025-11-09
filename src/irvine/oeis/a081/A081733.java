package irvine.oeis.a081;

import irvine.math.polynomial.EulerPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081733 Triangle read by rows, T(n,k) = 2^(n-k)*[x^k] Euler_polynomial(n, x), for n &gt;= 0, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A081733 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mPoly = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      mPoly = EulerPolynomials.eulerPolynomial(++mN);
    }
    return mPoly.coeff(mM).multiply(Z.ONE.shiftLeft(mN - mM)).toZ();
  }
}
