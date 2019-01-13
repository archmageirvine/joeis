package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002037.
 * @author Sean A. Irvine
 */
public class A002037 implements Sequence {

  private Z mP = Z.ONE;
  private Z mProd = null;
  private Z mLim = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (mProd == null) {
      mProd = Z.ONE;
    } else {
      mLim = mLim.multiply(3);
      Z p;
      while ((p = mPrime.nextPrime(mP)).compareTo(mLim) <= 0) {
        mP = p;
        mProd = mProd.multiply(mP);
      }
    }
    return mProd;
  }
}

