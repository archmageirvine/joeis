package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A081368 Next n digits of e, base of the natural logarithms.
 * @author Sean A. Irvine
 */
public class A081368 extends A001113 {

  private int mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    ++mN;
    Z v = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      v = v.multiply(10).add(mA);
      mA = super.next();
    }
    while (mA.isZero()) {
      v = v.multiply(10);
      mA = super.next();
    }
    return v;
  }
}

