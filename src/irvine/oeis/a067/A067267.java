package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067235.
 * @author Sean A. Irvine
 */
public class A067267 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p10 = p.multiply(10);
      if (p10.add(1).isProbablePrime() && p10.add(3).isProbablePrime() && p10.add(7).isProbablePrime() && p10.add(9).isProbablePrime()) {
        return p;
      }
    }
  }
}

