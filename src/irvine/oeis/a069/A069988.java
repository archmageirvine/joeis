package irvine.oeis.a069;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069988 (-1)^(n+1)/6*sum(k=1,2n+1,C(2n+1,k)*B(k)*3^k) where C(n,k) are the binomial coefficients, B(k) the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A069988 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final BernoulliSequence b = new BernoulliSequence(1);
    Q sum = Q.ZERO;
    Z t = Z.THREE;
    for (long k = 1; k <= 2 * mN + 1; ++k, t = t.multiply(3)) {
      sum = sum.add(b.nextQ().multiply(Binomial.binomial(2 * mN + 1, k)).multiply(t));
    }
    return sum.abs().toZ().divide(6);
  }
}

