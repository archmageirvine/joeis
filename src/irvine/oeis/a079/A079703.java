package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079703 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!p.multiply2().add(1).isProbablePrime()) {
        final Z p4 = p.multiply(4);
        if (!p4.add(1).isProbablePrime()) {
          return p4;
        }
      }
    }
  }
}

