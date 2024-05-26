package irvine.oeis.a069;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069852 a(n) = Sum_{i=0..2n} B(i)*C(2n+1,i)*5^i where B(i) are the Bernoulli numbers, C(2n,i) the binomial numbers.
 * @author Sean A. Irvine
 */
public class A069852 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final BernoulliSequence b = new BernoulliSequence(0);
    Q sum = Q.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k <= 2 * mN; ++k, f = f.multiply(5)) {
      final Q s = b.nextQ();
      if (!s.isZero()) {
        sum = sum.add(s.multiply(Binomial.binomial(2L * mN + 1, k)).multiply(f));
      }
    }
    return sum.toZ();
  }
}

