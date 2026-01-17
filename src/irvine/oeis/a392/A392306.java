package irvine.oeis.a392;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392306 Irregular triangle, read by rows, where row n lists composite numbers c such that c * sigma_n(c) == 2 (mod phi(c)) for n &gt;= 0. Row lengths for n=0,1,... are given in A392307.
 * @author Sean A. Irvine
 */
public class A392306 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mLim = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP  = mPrime.nextPrime(mP);
      if (mP > mLim) {
        mLim = 1L << (++mN + 2) + 3;
        mP = 2;
        return Z.FOUR; // efficiency
      }
      if (mP == 3) {
        return Z.SIX; // efficiency
      }
      if (mPrime.isPrime(mP) && Z.TWO.modPow(mN + 2, mP - 1).equals(mP - 3)) {
        return Z.valueOf(2 * mP);
      }
    }
  }
}

