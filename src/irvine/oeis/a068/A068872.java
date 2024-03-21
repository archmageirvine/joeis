package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068872 Composite numbers with all divisors congruent to 1 mod 10.
 * @author Sean A. Irvine
 */
public class A068872 extends A002808 {

  private boolean is(final Z c) {
    for (final Z d : Jaguar.factor(c).divisors()) {
      if (d.mod(10) != 1) {
        return false;
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
