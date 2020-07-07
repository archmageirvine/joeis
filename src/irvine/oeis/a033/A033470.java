package irvine.oeis.a033;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033470 Numerator of <code>Bernoulli(2n,1/3)</code>.
 * @author Sean A. Irvine
 */
public class A033470 implements Sequence {

  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(BernoulliPolynomials.firstKindEval(mN, Q.ONE_THIRD));
  }
}

