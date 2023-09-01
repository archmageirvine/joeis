package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065381 Primes not of the form p + 2^k, p prime and k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A065381 extends A000040 {

  private boolean is(final Z p) {
    long k = -1;
    Z t;
    while ((t = p.subtract(Z.TWO.pow(++k))).signum() > 0) {
      if (t.isProbablePrime()) {
        return false;
      }
    }
    return true;
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
