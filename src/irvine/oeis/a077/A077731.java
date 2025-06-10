package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A077731 Smallest square beginning with the reverse concatenation of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A077731 extends A000422 {

  @Override
  public Z next() {
    Z s = super.next();
    Z lim = s.add(1);
    while (true) {
      Z r = s.sqrt();
      Z u = r.square();
      while (u.compareTo(lim) < 0) {
        if (u.compareTo(s) >= 0) {
          return u;
        }
        r = r.add(1);
        u = r.square();
      }
      s = s.multiply(10);
      lim = lim.multiply(10);
    }
  }
}
