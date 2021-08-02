package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049491 Numbers k such that k and k+128 are both prime.
 * @author Sean A. Irvine
 */
public class A049491 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(128).isProbablePrime()) {
        return p;
      }
    }
  }
}
