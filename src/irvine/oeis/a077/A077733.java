package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A077733 Smallest n-th power beginning with the reverse concatenation of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A077733 extends A000422 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = super.next();
    Z lim = s.add(1);
    while (true) {
      Z r = s.root(mN);
      Z u = r.pow(mN);
      while (u.compareTo(lim) < 0) {
        if (u.compareTo(s) >= 0) {
          return u;
        }
        r = r.add(1);
        u = r.pow(mN);
      }
      s = s.multiply(10);
      lim = lim.multiply(10);
    }
  }
}
