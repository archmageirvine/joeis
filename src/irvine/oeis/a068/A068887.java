package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068887 Primes with property that digits alternate in parity individually as well as in concatenation with previous terms.
 * @author Sean A. Irvine
 */
public class A068887 extends A000040 {

  static boolean is(Z n) {
    if (Z.THREE.equals(n)) {
      return true; // only term starting with odd digit
    }
    boolean parity = n.isEven();
    while (true) {
      n = n.divide(10);
      if (n.isZero()) {
        return parity;
      }
      if (n.isEven() == parity) {
        return false;
      }
      parity = !parity;
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
