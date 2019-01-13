package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014753.
 * @author Sean A. Irvine
 */
public class A014753 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 60;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % 6 == 1) {
        for (long k = 2; k < mP; ++k) {
          if (LongUtils.modPow(k, 3, mP) == 3) {
            return Z.valueOf(mP);
          }
        }
      }
    }
  }
}

