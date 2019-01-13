package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A014459.
 * @author Sean A. Irvine
 */
public class A014459 extends A008292 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isEven()) {
        return t;
      }
    }
  }
}
