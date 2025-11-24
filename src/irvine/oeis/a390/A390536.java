package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A390536 Composite integers k = b * c such that A029837(k) &lt; A029837(b) + A029837(c) for all b&gt;1, c&gt;1, where A029837(x) = ceiling(log_2(x)).
 * @author Sean A. Irvine
 */
public class A390536 extends A002808 {

  private boolean is(final Z c) {
    final int cl = Functions.DIGIT_LENGTH.i(2, c.subtract(1));
    for (final Z d : Jaguar.factor(c).divisors()) {
      if (!d.isOne() && d.square().compareTo(c) <= 0) {
        final int dl = Functions.DIGIT_LENGTH.i(2, d.subtract(1));
        final int bl = Functions.DIGIT_LENGTH.i(2, c.divide(d).subtract(1));
        if (cl >= dl + bl) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (is(c)) {
        return c;
      }
    }
  }
}
