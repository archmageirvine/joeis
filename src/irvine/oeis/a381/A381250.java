package irvine.oeis.a381;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A381250 a(n) = least k with n distinct prime factors such that floor(log_q(k)) = floor(log_p(k))-1, where p is the smallest prime factor of k, and q is any other distinct prime factor of k.
 * @author Sean A. Irvine
 */
public class A381250 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mProd = Z.SIX;
  private long mSuperLo = 2;
  private long mLo = 3;
  private long mHi = 3;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      return Z.TWO;
    }
    if (mN == 2) {
      return Z.SIX;
    }
    mHi = mPrime.nextPrime(mHi); // Introduce one new factor
    mProd = mProd.multiply(mHi);
    while (true) {
      final CR logz = CR.valueOf(mProd).log();
      final Z logLo = logz.divide(CR.valueOf(mLo).log()).floor();
      final Z logHi = logz.divide(CR.valueOf(mHi).log()).floor();
      final Z logSuperLo = logz.divide(CR.valueOf(mSuperLo).log()).floor().subtract(1);
      if (logHi.equals(logLo) && logHi.equals(logSuperLo)) {
        return mProd; // not right
      }
      if (!logHi.equals(logSuperLo)) {
        mProd = mProd.divide(mSuperLo);
        mSuperLo = mPrime.nextPrime(mSuperLo);
        mProd = mProd.multiply(mSuperLo);
        if (mSuperLo == mLo) {
          mProd = mProd.divide(mLo);
          mLo = mPrime.nextPrime(mLo);
          mHi = mPrime.nextPrime(mHi);
          mProd = mProd.multiply(mHi);
        }
      } else {
        mProd = mProd.divide(mLo);
        mLo = mPrime.nextPrime(mLo);
        mHi = mPrime.nextPrime(mHi);
        mProd = mProd.multiply(mHi);
      }
    }
  }
}

