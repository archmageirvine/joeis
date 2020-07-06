package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033220 Primes of form <code>x^2+30*y^2</code>.
 * @author Sean A. Irvine
 */
public class A033220 extends A000040 {

  private static final long[] ALLOWED = {1, 31, 49, 79};

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(120);
      for (final long a : ALLOWED) {
        if (r == a) {
          return p;
        }
      }
    }
  }
}
