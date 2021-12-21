package irvine.oeis.a196;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A196838 Numerators of coefficients of Bernoulli polynomials with rising powers of the variable.
 * @author Sean A. Irvine
 */
public class A196838 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mB;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mB = BernoulliPolynomials.firstKind(++mN);
      mM = 0;
    }
    return select(mB.coeff(mM));
  }
}
