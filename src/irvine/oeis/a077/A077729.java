package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077729 Smallest square beginning with n copies of n.
 * @author Sean A. Irvine
 */
public class A077729 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z s = new Z(String.valueOf(++mN).repeat(mN));
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
