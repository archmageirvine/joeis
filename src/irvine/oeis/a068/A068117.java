package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A068117 Smallest square beginning with concatenation of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A068117 extends A007908 {

  @Override
  public Z next() {
    final Z c = super.next();
    if (c.isSquare()) {
      return c;
    }
    Z lo = c;
    Z hi = c;
    while (true) {
      lo = lo.multiply(10);
      hi = hi.multiply(10).add(9);
      final Z t = lo.sqrt().add(1).square();
      if (t.compareTo(hi) <= 0) {
        return t;
      }
    }
  }
}
