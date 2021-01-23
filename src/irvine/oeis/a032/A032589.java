package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A032589 Lucky numbers (A000959) ending with digit 9.
 * @author Sean A. Irvine
 */
public class A032589 extends A000959 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) == 9) {
        return t;
      }
    }
  }
}
