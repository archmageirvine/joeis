package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014752 Primes of the form x^2 + 27y^2.
 * @author Sean A. Irvine
 */
public class A014752 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 29;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % 3 == 1) {
        long a = 1;
        for (long k = 0; k < mP / 3; ++k) {
          a <<= 1;
          a %= mP;
        }
        if (a == 1) {
          return Z.valueOf(mP);
        }
      }
    }
  }
}

