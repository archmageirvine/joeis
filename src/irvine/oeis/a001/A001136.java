package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001136 Primes p such that the multiplicative order of 2 modulo p is <code>(p-1)/6</code>.
 * @author Sean A. Irvine
 */
public class A001136 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 30;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long h = mP - 1;
      if (h % 6 == 0) {
        final long powLimit = h / 6;
        long b = 16;
        for (long k = 5; k <= powLimit; ++k) {
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
