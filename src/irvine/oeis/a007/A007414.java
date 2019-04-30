package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007414 Largest number not a sum of distinct primes <code>&gt;= prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A007414 implements Sequence {

  // After Charles R. Greathouse IV

  private final Fast mPrime = new Fast();
  private long mP = 0;

  private boolean isSum(final long n, final long x) {
    if (mPrime.isPrime(n)) {
      return n >= x;
    }
    if (((n & 1) == 0) ? (n < 2 * x) : (n < 3 * x)) {
      return n == 0;
    }
    for (long p = mPrime.nextPrime(x - 1); p <= n - ((n & 1) == 0 ? x : 2 * x); p = mPrime.nextPrime(p)) {
      if (isSum(n - p, p + 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = 2 * mP - 2;
    long lower = k;
    long upper = 2 * k + 2;
    while (upper > lower) {
      if (isSum(upper, mP)) {
        --upper;
      } else {
        lower = 2 * k + 2;
        k = upper;
        upper = 2 * k + 2;
      }
    }
    return Z.valueOf(k);
  }
}
