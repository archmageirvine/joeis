package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038343 Maximal value of difference between successive primes among the first 10^n primes.
 * @author Sean A. Irvine
 */
public class A038343 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private long mLimit = 10;
  private long mPi = 0;
  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z p = mP;
      mP = mPrime.nextPrime(mP);
      if (++mPi == mLimit) {
        mLimit *= 10;
        final Z res = mMax;
        mMax = mMax.max(mP.subtract(p));
        return res;
      }
      mMax = mMax.max(mP.subtract(p));
    }
  }
}
