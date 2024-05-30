package irvine.oeis.a069;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069994 a(n) = Sum_{i=0..2n} B(i)*C(2n+1,i)*6^i where B(i) are the Bernoulli numbers, C(2n,i) the binomial coefficients.
 * @author Sean A. Irvine
 */
public class A069994 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.valueOf(-2);
    }
    final BernoulliSequence b = new BernoulliSequence(0);
    Q sum = Q.ZERO;
    Z t = Z.ONE;
    for (long k = 0; k <= 2 * mN; ++k, t = t.multiply(6)) {
      sum = sum.add(b.nextQ().multiply(Binomial.binomial(2 * mN + 1, k)).multiply(t));
    }
    return sum.toZ();
  }
}

