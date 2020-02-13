package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062326.
 * @author Sean A. Irvine
 */
public class A062326 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.square().subtract(2).isProbablePrime()) {
        return p;
      }
    }
  }
}
