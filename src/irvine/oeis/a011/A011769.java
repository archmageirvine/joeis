package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A011769.
 * @author Sean A. Irvine
 */
public class A011769 extends A000045 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z f = super.next();
      mA = mA.multiply(3).subtract(f.multiply(f.add(1)));
    }
    return mA;
  }
}
