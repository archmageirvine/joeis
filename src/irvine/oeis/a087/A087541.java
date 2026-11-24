package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087541 a(0) = 1, a(1) = 2, a(n) = smallest prime beginning with the product of two previous terms.
 * @author Sean A. Irvine
 */
public class A087541 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    Z t = mA.multiply(mB);
    if (t.isProbablePrime()) {
      mA = mB;
      mB = t;
      return t; // only happens for a(3)
    }
    t = t.multiply(10);
    long lim = 10;
    long k = -1;
    while (true) {
      k += 2;
      if (k >= lim) {
        t = t.multiply(10);
        lim *= 10;
        k = 1;
      }
      final Z u = t.add(k);
      if (u.isProbablePrime()) {
        mA = mB;
        mB = u;
        return u;
      }
    }
  }
}
