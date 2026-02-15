package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a007.A007770;

/**
 * A392990 Unhappy numbers that are sandwiched between two consecutive happy numbers.
 * @author Sean A. Irvine
 */
public class A392990 extends A007770 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).equals(Z.TWO)) {
        return t.add(1);
      }
    }
  }
}
