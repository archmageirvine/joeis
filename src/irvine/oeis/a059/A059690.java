package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059690 Number of distinct Cunningham chains of first kind whose initial prime (cf. A059453) falls into the interval [2^(n-1),2^n].
 * @author Sean A. Irvine
 */
public class A059690 extends A000040 {

  private Z mLim = Z.ONE;
  private Z mP = super.next();
  private long mCnt = 0;

  @Override
  public Z next() {
    mLim = mLim.multiply2();
    while (mP.compareTo(mLim) <= 0) {
      if (!mPrime.isPrime(mP.subtract(1).divide2()) && mPrime.isPrime(mP.multiply2().add(1))) {
        ++mCnt;
      }
      mP = super.next();
    }
    return Z.valueOf(mCnt);
  }
}

