package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078833 Greatest prime contained as binary substring in binary representation of n&gt;1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A078833 extends Sequence1 {

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
          if (r > max && mPrime.isPrime(r)) {
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
