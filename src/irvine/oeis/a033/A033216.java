package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033216 Primes of form <code>x^2+22*y^2</code>.
 * @author Sean A. Irvine
 */
public class A033216 extends A000040 {

  private static final long[] ALLOWED = {1, 9, 15, 23, 25, 31, 47, 49, 71, 81};

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(88);
      for (final long a : ALLOWED) {
        if (r == a) {
          return p;
        }
      }
    }
  }
}
