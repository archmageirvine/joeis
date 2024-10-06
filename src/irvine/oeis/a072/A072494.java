package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a007.A007770;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072494 extends A007770 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (Z.TWO.equals(mB.subtract(t))) {
        return t;
      }
    }
  }
}
