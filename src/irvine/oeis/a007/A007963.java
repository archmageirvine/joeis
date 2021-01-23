package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007963 Number of (unordered) ways of writing 2n+1 as a sum of 3 odd primes.
 * @author Sean A. Irvine
 */
public class A007963 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private long isExpressible2(final long n, final long p) {
    long cnt = 0;
    long q = p;
    while (q > 2 && 2 * q >= n) {
      if (mPrime.isPrime(n - q)) {
        ++cnt;
      }
      q = mPrime.prevPrime(q);
    }
    return cnt;
  }

  private long countExpressible3(final long n, final long p) {
    long cnt = 0;
    long q = p;
    while (q > 2 && 3 * q >= n) {
      cnt += isExpressible2(n - q, q);
      q = mPrime.prevPrime(q);
    }
    return cnt;
  }

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(countExpressible3(mN, mPrime.prevPrime(mN + 1)));
  }
}
