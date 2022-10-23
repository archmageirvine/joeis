package irvine.oeis.a053;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053382 Triangle T(n,k) giving numerator of coefficient of x^(n-k) in Bernoulli polynomial B(n, x), n &gt;= 0, 0&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A053382 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mB;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mB = BernoulliPolynomials.firstKind(++mN);
      mM = mB.degree();
    }
    return select(mB.coeff(mM));
  }
}
