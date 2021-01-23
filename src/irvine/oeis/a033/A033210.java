package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033210 Primes of the form x^2+13*y^2.
 * @author Sean A. Irvine
 */
public class A033210 extends A000040 {

  private static final long[] ALLOWED = {1, 9, 13, 17, 25, 29, 49};

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(52);
      for (final long a : ALLOWED) {
        if (r == a) {
          return p;
        }
      }
    }
  }
}
