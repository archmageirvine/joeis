package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A068121 Smallest n-th power beginning with the concatenation of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A068121 extends A007908 {

  @Override
  public Z next() {
    final Z c = super.next();
    final int n = (int) mN;
    if (c.root(n).auxiliary() == 1) {
      return c;
    }
    Z lo = c;
    Z hi = c;
    while (true) {
      lo = lo.multiply(10);
      hi = hi.multiply(10).add(9);
      final Z t = lo.root(n).add(1).pow(n);
      if (t.compareTo(hi) <= 0) {
        return t;
      }
    }
  }
}
