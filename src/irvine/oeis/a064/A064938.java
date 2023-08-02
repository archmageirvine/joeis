package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064933.
 * @author Sean A. Irvine
 */
public class A064938 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!mPrime.isPrime(++mN)) {
        if (Z.valueOf(mP).square().subtract(1).mod(mN) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
