package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046133 p and p+12 are both prime.
 * @author Sean A. Irvine
 */
public class A046133 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(12).isProbablePrime()) {
        return p;
      }
    }
  }
}
