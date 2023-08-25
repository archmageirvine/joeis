package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065139 Numbers n such that the sum of prime(n) and pi(n) is divisible by n.
 * @author Sean A. Irvine
 */
public class A065139 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;
  private long mPi = 0;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(++mN)) {
        ++mPi;
      }
      if ((mP + mPi) % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

