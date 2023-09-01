package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065377 Primes not of the form p + k^2, with p prime and k &gt; 0.
 * @author Sean A. Irvine
 */
public class A065377 extends A000040 {

  private boolean is(final Z p) {
    long k = 0;
    Z t;
    while ((t = p.subtract(++k * k)).signum() > 0) {
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
