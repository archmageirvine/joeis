package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030475.
 * @author Sean A. Irvine
 */
public class A030480 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!A030475.isMixed(p.square())) {
        return p;
      }
    }
  }
}
