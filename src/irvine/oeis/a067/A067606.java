package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067603.
 * @author Sean A. Irvine
 */
public class A067606 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p7 = p.add(7);
      if (p7.mod(Euler.phi(p7)).isZero()) {
        return p;
      }
    }
  }
}

