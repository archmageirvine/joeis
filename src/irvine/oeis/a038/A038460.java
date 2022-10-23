package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038460 Maximal value of difference between successive primes among numbers &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A038460 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mLimit = 10;
  private long mMax = 0;

  @Override
  public Z next() {
    while (true) {
      final long p = mP;
      mP = mPrime.nextPrime(mP);
      if (mP >= mLimit) {
        mLimit *= 10;
        final long res = mMax;
        mMax = Math.max(mMax, mP - p);
        return Z.valueOf(res);
      }
      mMax = Math.max(mMax, mP - p);
    }
  }
}
