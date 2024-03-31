package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069044 N(B(2*p))/p for p prime&gt;=5 and where N(B(2n)) are the numerators of Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A069044 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mB.nextQ();
      final Z t = mB.nextQ().num();
      if (++mN >= 5 && mPrime.isPrime(mN)) {
        return t.divide(mN);
      }
    }
  }
}

