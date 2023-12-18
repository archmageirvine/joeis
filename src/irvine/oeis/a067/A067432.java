package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067432 Number of ways to represent the n-th prime in form p*q+p+q, where p and q are primes (see A066938).
 * @author Sean A. Irvine
 */
public class A067432 extends A000040 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final long n = super.next().longValueExact();
    long cnt = 0;
    for (long p = 2; 2 * p < n; p = mPrime.nextPrime(p)) {
      final long t = n - p;
      if (t % (p + 1) == 0) {
        final long q = t / (p + 1);
        if (q <= p && mPrime.isPrime(q)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
