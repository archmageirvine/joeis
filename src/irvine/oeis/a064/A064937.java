package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064933.
 * @author Sean A. Irvine
 */
public class A064937 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!mPrime.isPrime(++mN)) {
        final Z m = Z.valueOf(mN);
        if (Z.valueOf(mP).square().subtract(1).gcd(m).equals(Z.ONE)) {
          return m;
        }
      }
    }
  }
}
