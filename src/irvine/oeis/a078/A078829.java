package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A078829 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  private boolean is(final long n) {
    long m = n;
    long seen = 0;
    do {
      long k = 1;
      while (k <= m) {
        k <<= 1;
        k += 1;
        final long r = m & k;
        if (mPrime.isPrime(r)) {
          if (seen == 0) {
            seen = r;
          } else if (seen != r) {
            return false;
          }
        }
      }
      m >>>= 1;
    } while (m > 1);
    return seen != 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
