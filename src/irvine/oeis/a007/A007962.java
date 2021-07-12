package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007962 a(n) is the largest odd number k such that 9, 11, ..., k are sums of 3 of first n odd primes.
 * @author Sean A. Irvine
 */
public class A007962 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 9;
  private long mP = 2;

  private boolean isExpressible2(final long n, final long p) {
    long q = p;
    while (n - q <= p) {
      if (mPrime.isPrime(n - q)) {
        return true;
      }
      q = mPrime.prevPrime(q);
    }
    return false;
  }

  private boolean isExpressible3(final long n, final long p) {
    long q = p;
    while (n - 2 * q <= p) {
      if (isExpressible2(n - q, q)) {
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
      if (!isExpressible3(mN, mP)) {
        return Z.valueOf(mN - 2);
      }
      mN += 2;
    }
  }
}
