package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065376 Primes of the form p + k^2, p prime and k &gt; 0.
 * @author Sean A. Irvine
 */
public class A065376 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      long k = 0;
      Z t;
      while ((t = p.subtract(++k * k)).signum() > 0) {
        if (t.isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
