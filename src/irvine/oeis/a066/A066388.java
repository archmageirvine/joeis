package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A066232.
 * @author Timothy Rolfe
 * @author Sean A. Irvine
 */
public class A066388 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p2 = p.multiply2();
      if (p2.add(1).isProbablePrime() && p2.add(3).isProbablePrime()) {
        return p.add(1);
      }
    }
  }
}

