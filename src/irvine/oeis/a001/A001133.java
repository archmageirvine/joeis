package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001133 Primes p such that the multiplicative order of 2 modulo p is (p-1)/3.
 * @author Sean A. Irvine
 */
public class A001133 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 41;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long powLimit = (mP - 1) / 3;
      long b = 32;
      for (long k = 6; k <= powLimit; ++k) {
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
