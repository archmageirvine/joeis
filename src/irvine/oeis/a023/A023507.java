package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023507 <code>a(n) =</code> sum of distinct prime divisors of <code>prime(n) - 1</code>.
 * @author Sean A. Irvine
 */
public class A023507 extends A000040 {

  static Z sum(final Z[] a) {
    Z sum = Z.ZERO;
    for (final Z v : a) {
      sum = sum.add(v);
    }
    return sum;
  }

  @Override
  public Z next() {
    return sum(Cheetah.factor(super.next().subtract(1)).toZArray());
  }
}
