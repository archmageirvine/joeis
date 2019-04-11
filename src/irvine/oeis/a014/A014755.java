package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014755 3 and <code>-3</code> are both 4th powers (one implies other) mod these primes p=1 <code>mod 8</code>.
 * @author Sean A. Irvine
 */
public class A014755 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 192;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 7) == 1) {
        for (long k = 2; k < mP; ++k) {
          if (LongUtils.modPow(k, 4, mP) == 3) {
            return Z.valueOf(mP);
          }
        }
      }
    }
  }
}

