package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A084674 Products of the digits of e excluding 0.
 * @author Sean A. Irvine
 */
public class A084674 extends A001113 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isZero());
    mProd = mProd.multiply(t);
    return mProd;
  }
}
