package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064653 Integers not expressible as p + q*a^2, a&gt;1 and p, q are primes.
 * @author Sean A. Irvine
 */
public class A064653 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long n) {
    for (long q = 2; 4 * q < n; q = mPrime.nextPrime(q)) {
      for (long a = 2; q * a * a < n; ++a) {
        if (mPrime.isPrime(mN - q * a * a)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (!is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
