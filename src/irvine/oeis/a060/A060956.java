package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A060956 Leading digit of 3^n.
 * @author Sean A. Irvine
 */
public class A060956 extends A000244 {

  @Override
  public Z next() {
    Z t = super.next();
    while (t.compareTo(Z.TEN) >= 0) {
      t = t.divide(10);
    }
    return t;
  }
}
