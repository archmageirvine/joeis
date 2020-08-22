package irvine.oeis.a033;

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033473 Numerator of (2*n+1)!*8*Bernoulli(2*n,1/2).
 * @author Sean A. Irvine
 */
public class A033473 implements Sequence {

  private int mN = -2;
  private Z mF = Z.EIGHT;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mF = mF.multiply(mN).multiply(mN + 1);
    }
    return select(BernoulliPolynomials.firstKindEval(mN, Q.HALF).multiply(mF));
  }
}

