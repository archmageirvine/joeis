package irvine.oeis.a033;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033469 Denominator of Bernoulli(2n,1/2).
 * @author Sean A. Irvine
 */
public class A033469 implements Sequence {

  private int mN = -2;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(BernoulliPolynomials.firstKindEval(mN, Q.HALF));
  }
}

