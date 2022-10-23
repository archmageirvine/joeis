package irvine.oeis.a033;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033475 Denominator of Bernoulli(2n,1/4).
 * @author Sean A. Irvine
 */
public class A033475 extends Sequence0 {

  private int mN = -2;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(BernoulliPolynomials.firstKindEval(mN, Q.ONE_QUARTER));
  }
}

