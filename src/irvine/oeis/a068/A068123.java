package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068123 Smallest n-th power beginning with n copies of n.
 * @author Sean A. Irvine
 */
public class A068123 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z c = new Z(String.valueOf(++mN).repeat(mN));
    if (c.root(mN).auxiliary() == 1) {
      return c;
    }
    Z lo = c;
    Z hi = c;
    while (true) {
      lo = lo.multiply(10);
      hi = hi.multiply(10).add(9);
      final Z t = lo.root(mN).add(1).pow(mN);
      if (t.compareTo(hi) <= 0) {
        return t;
      }
    }
  }
}
