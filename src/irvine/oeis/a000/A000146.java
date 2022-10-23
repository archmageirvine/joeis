package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000146 From von Staudt-Clausen representation of Bernoulli numbers: a(n) = Bernoulli(2n) + Sum_{(p-1)|2n} 1/p.
 * @author Sean A. Irvine
 */
public class A000146 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mB.nextQ();
    Q s = mB.nextQ();
    mN += 2;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final long dp = d.longValue() + 1;
      if (mPrime.isPrime(dp)) {
        s = s.add(new Q(1, dp));
      }
    }
    assert s.isInteger();
    return s.toZ();
  }
}

