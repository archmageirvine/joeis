package irvine.oeis.a045;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045718 Nearest neighbors of primes.
 * @author Sean A. Irvine
 */
public class A045718 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(mN++) || mPrime.isPrime(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
