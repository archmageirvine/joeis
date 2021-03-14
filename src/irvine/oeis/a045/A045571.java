package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a056.A056525;

/**
 * A045571.
 * @author Sean A. Irvine
 */
public class A045571 extends A056525 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(11) == 0) {
        return n;
      }
    }
  }
}
