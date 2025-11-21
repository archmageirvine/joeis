package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A390536 allocated for Szymon Lukaszyk.
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
