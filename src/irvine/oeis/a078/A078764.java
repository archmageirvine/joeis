package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078764 List primes between (2n)^2 and (2n+1)^2.
 * @author Sean A. Irvine
 */
public class A078764 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mLim = 1;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (mP > mLim) {
      mP = mPrime.nextPrime((mN + 1) * (mN + 1));
      mN += 2;
      mLim = mN * mN;
    }
    return Z.valueOf(mP);
  }
}

