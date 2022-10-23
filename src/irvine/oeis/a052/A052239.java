package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052239 Smallest prime p in set of 4 consecutive primes in arithmetic progression with common difference 6n.
 * @author Sean A. Irvine
 */
public class A052239 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 6;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      final long q = mPrime.nextPrime(p);
      if (q - p == mN) {
        final long r = mPrime.nextPrime(q);
        if (r - q == mN) {
          final long s = mPrime.nextPrime(r);
          if (s - r == mN) {
            return Z.valueOf(p);
          }
        }
      }
    }
  }
}
