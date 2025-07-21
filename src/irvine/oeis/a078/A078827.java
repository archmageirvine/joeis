package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078827 Number of primes contained as binary substrings in binary representation of n, counted with repetitions.
 * @author Sean A. Irvine
 */
public class A078827 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    do {
      long k = 1;
      long j = 1;
      while (k <= m) {
        j <<= 1;
        k <<= 1;
        k += 1;
        if ((m & j) != 0) {
          final long r = m & k;
          if (mPrime.isPrime(r)) {
            ++cnt;
          }
        }
      }
      m >>>= 1;
    } while (m > 1);
    return Z.valueOf(cnt);
  }
}
