package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061671 Numbers n such that { x +- 2^k : 0 &lt; k &lt; 4 } are primes, where x = 210*n - 105.
 * @author Sean A. Irvine
 */
public class A061671 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long t = 210 * ++mN - 105;
      if (mPrime.isPrime(t - 2)
        && mPrime.isPrime(t + 2)
        && mPrime.isPrime(t - 4)
        && mPrime.isPrime(t + 4)
        && mPrime.isPrime(t - 8)
        && mPrime.isPrime(t + 8)
      ) {
        return Z.valueOf(mN);
      }
    }
  }
}

