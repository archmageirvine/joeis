package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033202 Primes of form <code>x^2+93*y^2</code>.
 * @author Sean A. Irvine
 */
public class A033202 extends A000040 {

  private static final long[] ALLOWED = {1, 25, 49, 97, 109, 121, 133, 157, 169, 193, 205, 253, 289, 349, 361};

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(372);
      for (final long a : ALLOWED) {
        if (r == a) {
          return p;
        }
      }
    }
  }
}
