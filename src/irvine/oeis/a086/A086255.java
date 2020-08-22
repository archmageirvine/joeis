package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A086255 a(n) is the first prime for which floor(a(n)/p) is prime for all p among the first n primes.
 * @author Sean A. Irvine
 */
public class A086255 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mPrev = 5;
  private int mN = 0;

  private long[] firstPrimes(final int n) {
    final long[] res = new long[n];
    long p = 1;
    for (int k = 0; k < n; ++k) {
      p = mPrime.nextPrime(p);
      res[k] = p;
    }
    return res;
  }

  @Override
  public Z next() {
    final long[] primes = firstPrimes(++mN);
    while (true) {
      boolean ok = true;
      for (final long p : primes) {
        if (!mPrime.isPrime(mPrev / p)) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mPrev);
      }
      mPrev = mPrime.nextPrime(mPrev);
    }
  }
}
