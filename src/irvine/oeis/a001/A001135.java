package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001135 Primes p such that the multiplicative order of 2 modulo p is (p-1)/5.
 * @author Sean A. Irvine
 */
public class A001135 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 250;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long h = mP - 1;
      if (h % 5 == 0) {
        final long powLimit = h / 5;
        long b = 128;
        for (long k = 8; k <= powLimit; ++k) {
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
