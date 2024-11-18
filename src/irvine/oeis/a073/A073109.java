package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073109 a(n) = (Product_{p&lt;=n, p odd prime} p) * Sum_{k=1..n} B(k)*C(2k,k) where B(k) is the k-th Bernoulli number.
 * @author Sean A. Irvine
 */
public class A073109 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private final BernoulliSequence mB = new BernoulliSequence(2);
  private long mN = 1;
  private Q mA = Q.NEG_ONE;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 2 && mPrime.isPrime(mN)) {
      mProd = mProd.multiply(mN);
    }
    mA = mA.add(mB.nextQ().multiply(Binomial.binomial(2 * mN, mN)));
    return mA.multiply(mProd).toZ();
  }
}
