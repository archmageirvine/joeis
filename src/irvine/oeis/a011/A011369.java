package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A011369.
 * @author Sean A. Irvine
 */
public class A011369 extends A000045 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      final Z f = super.next();
      final Z s = mA.subtract(f);
      mA = s.signum() > 0 ? s : mA.add(f);
    }
    return mA;
  }
}
