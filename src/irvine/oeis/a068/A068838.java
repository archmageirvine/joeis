package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068838 Smallest prime with concatenation of first n even numbers as leading digits.
 * @author Sean A. Irvine
 */
public class A068838 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 0;
  private long mLim = 10;

  @Override
  public Z next() {
    mN += 2;
    if (mN >= mLim) {
      mLim *= 10;
    }
    mA = mA.multiply(mLim).add(mN);
    if (mA.isProbablePrime()) {
      return mA;
    }
    long lim = 1;
    long k = -1;
    Z t = mA;
    while (true) {
      k += 2;
      if (k >= lim) {
        t = t.multiply(10);
        k = 1;
        lim *= 10;
      }
      final Z u = t.add(k);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
