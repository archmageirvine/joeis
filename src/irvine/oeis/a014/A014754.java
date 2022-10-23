package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014754 Primes p == 1 mod 8 such that 2 and -2 are both 4th powers (one implies other) mod p.
 * @author Sean A. Irvine
 */
public class A014754 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 72;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 7) == 1) {
        for (long k = 2; k < mP; ++k) {
          if (LongUtils.modPow(k, 4, mP) == 2) {
            return Z.valueOf(mP);
          }
        }
      }
    }
  }
}

