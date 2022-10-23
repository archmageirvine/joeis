package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001134 Primes p such that the multiplicative order of 2 modulo p is (p-1)/4.
 * @author Sean A. Irvine
 */
public class A001134 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 112;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long h = mP - 1;
      if ((h & 3) == 0) {
        final long powLimit = h >>> 2;
        long b = 64;
        for (long k = 7; k <= powLimit; ++k) {
          b = b << 1;
          b %= mP;
          if (b == 1) {
            if (k == powLimit) {
              return Z.valueOf(mP);
            }
            break;
          }
        }
      }
    }
  }
}
