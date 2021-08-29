package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a308.A308951;

/**
 * A051235 Number of distinct most-perfect pandiagonal magic squares of order 4n in the Frenicle standard form.
 * @author Sean A. Irvine
 */
public class A051235 extends A308951 {

  private Z mA = Z.valueOf(16);

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN == 0) {
      return t;
    }
    if (mN > 1) {
      mA = mA.multiply(mN).multiply(mN).multiply(2 * mN - 1).multiply(2 * mN - 1).shiftLeft(6);
    }
    return t.multiply(mA);
  }
}
