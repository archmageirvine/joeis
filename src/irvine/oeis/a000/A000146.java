package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A000146.
 * @author Sean A. Irvine
 */
public class A000146 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mB.next();
    Q s = mB.next();
    mN += 2;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final long dp = d.longValue() + 1;
      if (mPrime.isPrime(dp)) {
        s = s.add(new Q(1, dp));
      }
    }
    assert s.isInteger();
    return s.toZ();
  }
}

