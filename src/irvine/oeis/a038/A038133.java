package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038133 From a subtractive Goldbach conjecture: odd primes that are not cluster primes.
 * @author Sean A. Irvine
 */
public class A038133 extends Sequence1 {

  protected final Fast mPrime = new Fast();
  private long mP = 95;

  private boolean isClusterPrime(final long p, final long k) {
    for (long q = 2; k + q <= p; q = mPrime.nextPrime(q)) {
      if (mPrime.isPrime(k + q)) {
        return true;
      }
    }
    return false;
  }

  protected boolean isClusterPrime(final long p) {
    for (long k = 2; k <= p - 3; k += 2) {
      if (!isClusterPrime(p, k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!isClusterPrime(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
