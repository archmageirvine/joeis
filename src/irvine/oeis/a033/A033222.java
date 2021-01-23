package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033222 Primes of form x^2+33*y^2.
 * @author Sean A. Irvine
 */
public class A033222 extends A000040 {

  private static final long[] ALLOWED = {1, 25, 37, 49, 97};

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(132);
      for (final long a : ALLOWED) {
        if (r == a) {
          return p;
        }
      }
    }
  }
}
