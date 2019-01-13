package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A239675.
 * @author Sean A. Irvine
 */
public class A239675 extends A000041 {

  @Override
  public Z next() {
    final Z pn = super.next();
    long k = 0;
    while (true) {
      if (pn.add(++k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
