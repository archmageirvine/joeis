package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A032588 Lucky numbers ending with digit 7.
 * @author Sean A. Irvine
 */
public class A032588 extends A000959 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) == 7) {
        return t;
      }
    }
  }
}
