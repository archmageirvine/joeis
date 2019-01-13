package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a063.A063691;

/**
 * A014465.
 * @author Sean A. Irvine
 */
public class A014465 extends A063691 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.signum() != 0) {
        return t;
      }
    }
  }
}
