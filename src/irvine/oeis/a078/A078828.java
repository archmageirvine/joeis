package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078828 Product of all primes contained as binary substrings in binary representation of n.
 * @author Sean A. Irvine
 */
public class A078828 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z prod = Z.ONE;
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
            prod = prod.multiply(r);
          }
        }
      }
      m >>>= 1;
    } while (m > 1);
    return prod;
  }
}
