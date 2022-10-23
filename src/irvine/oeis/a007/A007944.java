package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007944 a(n) is the largest even number k such that 6, 8, ..., k are sums of 2 of first n odd primes.
 * @author Sean A. Irvine
 */
public class A007944 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 6;
  private long mP = 2;

  private boolean isExpressible(final long n, final long p) {
    long q = p;
    while (n - q <= p) {
      if (mPrime.isPrime(n - q)) {
        return true;
      }
      q = mPrime.prevPrime(q);
    }
    return false;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP); // new maximum prime
    while (true) {
      if (!isExpressible(mN, mP)) {
        return Z.valueOf(mN - 2);
      }
      mN += 2;
    }
  }
}
