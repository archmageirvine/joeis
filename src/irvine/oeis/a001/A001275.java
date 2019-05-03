package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001275 Smallest prime p such that the product of <code>q/(q-1)</code> over the primes from <code>prime(n)</code> to p is greater than 2.
 * @author Sean A. Irvine
 */
public class A001275 implements Sequence {

  private final Fast mPrime = new Fast();
  private Q mProd = Q.ONE;
  private long mP = 1;
  private long mQ = 1;

  @Override
  public Z next() {
    if (mP > 1) {
      mProd = mProd.divide(new Q(mP, mP - 1));
    }
    mP = mPrime.nextPrime(mP);
    while (mProd.compareTo(Q.TWO) <= 0) {
      mQ = mPrime.nextPrime(mQ);
      mProd = mProd.multiply(new Q(mQ, mQ - 1));
    }
    return Z.valueOf(mQ);
  }
}
