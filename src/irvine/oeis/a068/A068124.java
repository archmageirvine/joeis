package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068124 Smallest number whose n-th power begins with n n's; n-th root of A068123.
 * @author Sean A. Irvine
 */
public class A068124 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z c = new Z(String.valueOf(++mN).repeat(mN));
    final Z u = c.root(mN);
    if (u.auxiliary() == 1) {
      return u;
    }
    Z lo = c;
    Z hi = c;
    while (true) {
      lo = lo.multiply(10);
      hi = hi.multiply(10).add(9);
      final Z r = lo.root(mN).add(1);
      final Z t = r.pow(mN);
      if (t.compareTo(hi) <= 0) {
        return r;
      }
    }
  }
}
