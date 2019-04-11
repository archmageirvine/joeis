package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002373 Smallest prime in decomposition of <code>2n</code> into sum of two odd primes.
 * @author Sean A. Irvine
 */
public class A002373 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    final long m = 2 * ++mN;
    long p = 3;
    while (true) {
      if (mPrime.isPrime(m - p)) {
        return Z.valueOf(p);
      }
      p = mPrime.nextPrime(p);
    }
  }
}
