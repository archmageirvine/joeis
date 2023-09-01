package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065396 Primes of the form p + k*(k+1) / 2, p prime and k &gt; 0.
 * @author Sean A. Irvine
 */
public class A065396 extends A000040 {

  protected boolean is(final Z p) {
    long k = 0;
    Z t;
    while ((t = p.subtract(++k * (k + 1) / 2)).signum() > 0) {
      if (t.isProbablePrime()) {
        return true;
      }
    }
    return false;
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
