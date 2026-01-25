package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083414 Write the numbers from 1 to n^2 consecutively in n rows of length n; let c(k) = number of primes in k-th column; a(n) = minimal c(k) for gcd(k,n) = 1.
 * @author Sean A. Irvine
 */
public class A083414 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long min = Long.MAX_VALUE;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        int cnt = 0;
        for (long j = k; j < mN * mN; j += mN) {
          if (mPrime.isPrime(j)) {
            ++cnt;
          }
        }
        if (cnt < min) {
          min = cnt;
        }
      }
    }
    return Z.valueOf(min);
  }
}
