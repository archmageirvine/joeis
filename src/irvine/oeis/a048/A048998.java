package irvine.oeis.a048;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048998 Triangle giving coefficients of (n+1)!*B_n(x), where B_n(x) is a Bernoulli polynomial. Rising powers of x.
 * @author Sean A. Irvine
 */
public class A048998 extends Sequence0 {

  private Polynomial<Q> mB = BernoulliPolynomials.firstKind(0);
  private int mN = 0;
  private int mM = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mM > mB.degree()) {
      mB = BernoulliPolynomials.firstKind(++mN);
      mM = 0;
      mF = mF.multiply(mN + 1);
    }
    return mB.coeff(mM).multiply(mF).toZ();
  }
}
