package irvine.oeis.a384;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384229 Numerators of the expected number of steps to hit the opposite corner by simple random walk on the n-cube.
 * @author Sean A. Irvine
 */
public class A384229 extends Sequence1 {

  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  // a(n) = numerator(2^(n-1) * Sum_{i=0..n-1} 1/binomial(n-1,i)).

  @Override
  public Z next() {
    ++mN;
    final Q sum = Rationals.SINGLETON.sum(0, mN, k -> new Q(Z.ONE, Binomial.binomial(mN, k)));
    return select(sum.multiply(Z.ONE.shiftLeft(mN)));
  }
}

