package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066738 Primes that are concatenations of nonprime numbers.
 * @author Sean A. Irvine
 */
public class A066738 extends A000040 {

  private boolean is(final Z n) {
    Z t = Z.TEN;
    while (t.compareTo(n) < 0) {
      final Z r = n.mod(t);
      // Second condition eliminates leading 0s
      if (!r.isProbablePrime() && r.multiply(10).compareTo(t) >= 0 && is(n.divide(t))) {
        return true;
      }
      t = t.multiply(10);
    }
    return !n.isProbablePrime();
  }

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      if (is(prime)) {
        return prime;
      }
    }
  }
}
