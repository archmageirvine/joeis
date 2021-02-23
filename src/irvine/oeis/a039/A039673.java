package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039673 Twin Fibonacci-lucky numbers.
 * @author Sean A. Irvine
 */
public class A039673 extends A039693 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA != null) {
      final Z t = mA;
      mA = null;
      return t;
    } else {
      final Z t = super.next();
      mA = t.add(2);
      return t;
    }
  }
}
