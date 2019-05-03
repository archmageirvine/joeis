package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014754 Primes p <code>== 1 mod 8</code> such that 2 and -2 are both 4th powers (one implies other) <code>mod</code> p.
 * @author Sean A. Irvine
 */
public class A014754 implements Sequence {

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

