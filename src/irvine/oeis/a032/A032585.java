package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A032585 Lucky numbers ending with digit 1.
 * @author Sean A. Irvine
 */
public class A032585 extends A000959 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) == 1) {
        return t;
      }
    }
  }
}
