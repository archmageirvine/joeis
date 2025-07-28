package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079013 Least prime p introducing prime-difference pattern {d, 2*d, 4*d, 8*d}, where d = 2*n, i.e., {p, p+2*n, p+6*n, p+14*n, p+30*n} are consecutive primes.
 * @author Sean A. Irvine
 */
public class A079013 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      final long q = mPrime.nextPrime(p);
      if (q - p == mN) {
        final long r = mPrime.nextPrime(q);
        if (r - p == 3 * mN) {
          final long s = mPrime.nextPrime(r);
          if (s - p == 7 * mN) {
            final long t = mPrime.nextPrime(s);
            if (t - p == 15 * mN) {
              return Z.valueOf(p);
            }
          }
        }
      }
    }
  }
}
