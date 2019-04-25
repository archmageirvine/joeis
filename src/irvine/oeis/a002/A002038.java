package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002038 Numbers dividing A002037(i) and larger than A002037(i-1), for some <code>i&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A002038 implements Sequence {

  // After M. F. Hasler

  private Z mLim = Z.ONE;
  private Z mProd = Z.ONE;
  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(1);
      if (mA.compareTo(mProd) > 0) {
        Z p = mLim;
        mLim = mLim.multiply(3);
        while ((p = mPrime.nextPrime(p)).compareTo(mLim) <= 0) {
          mProd = mProd.multiply(p);
        }
      }
      if (Z.ZERO.equals(mProd.mod(mA))) {
        return mA;
      }
    }
  }
}
