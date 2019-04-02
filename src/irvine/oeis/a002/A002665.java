package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002665 Continued fraction expansion of Lehmer's constant.
 * @author Sean A. Irvine
 */
public class A002665 extends A002065 {

  private Z mA0 = null;
  private Z mA1 = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA0 == null) {
      mA0 = Z.ONE;
      return Z.ZERO;
    }
    if (mA1 == null) {
      mA1 = Z.ONE;
    } else if (mB == null) {
      mB = super.next();
    } else {
      final Z t = super.next();
      final Z s = mB.add(t).add(1);
      mB = t;
      final Z r = mA0.multiply(s);
      mA0 = mA1;
      mA1 = r;
    }
    return mA1;
  }
}
