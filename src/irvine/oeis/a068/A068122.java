package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A068109.
 * @author Sean A. Irvine
 */
public class A068122 extends A007908 {

  @Override
  public Z next() {
    final Z c = super.next();
    final int n = (int) mN;
    final Z u = c.root(n);
    if (u.auxiliary() == 1) {
      return u;
    }
    Z lo = c;
    Z hi = c;
    while (true) {
      lo = lo.multiply(10);
      hi = hi.multiply(10).add(9);
      final Z r = lo.root(n).add(1);
      final Z t = r.pow(n);
      if (t.compareTo(hi) <= 0) {
        return r;
      }
    }
  }
}
