package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078834 Greatest prime factor of n also contained as binary substring in binary representation of n; a(n)=1, if no such factor exists.
 * @author Sean A. Irvine
 */
public class A078834 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private long max(final long n) {
    if (mPrime.isPrime(n)) {
      return n;
    }
    long m = n;
    long max = 1;
    do {
      long k = 1;
      long j = 1;
      while (k <= m) {
        k <<= 1;
        k += 1;
        j <<= 1;
        if ((m & j) != 0) {
          final long r = m & k;
          if (r > max && mN % r == 0 && mPrime.isPrime(r)) {
            max = r;
          }
        }
      }
      m >>>= 1;
    } while (m > 1);
    return max;
  }

  @Override
  public Z next() {
    return Z.valueOf(max(++mN));
  }
}
