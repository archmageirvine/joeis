package irvine.oeis.a048;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048999 Triangle giving coefficients of (n+1)!*B_n(x), where B_n(x) is a Bernoulli polynomial, ordered by falling powers of x.
 * @author Sean A. Irvine
 */
public class A048999 implements Sequence {

  private Polynomial<Q> mB = BernoulliPolynomials.firstKind(0);
  private int mN = 0;
  private int mM = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (--mM < 0) {
      mB = BernoulliPolynomials.firstKind(++mN);
      mM = mB.degree();
      mF = mF.multiply(mN + 1);
    }
    return mB.coeff(mM).multiply(mF).toZ();
  }
}
