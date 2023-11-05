package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A066737 Composite numbers that are concatenations of primes.
 * @author Sean A. Irvine
 */
public class A066737 extends A002808 {

  private boolean is(final Z c) {
    if (c.isProbablePrime()) {
      return true;
    }
    Z t = Z.TEN;
    while (t.compareTo(c) < 0) {
      final Z r = c.mod(t);
      // Second condition eliminates leading 0s
      if (r.isProbablePrime() && r.multiply(10).compareTo(t) >= 0 && is(c.divide(t))) {
        return true;
      }
      t = t.multiply(10);
    }
    return false;
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
