package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033212 Primes congruent to 1 or <code>19 (mod 30)</code>.
 * @author Sean A. Irvine
 */
public class A033212 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(30);
      if (r == 1 || r == 19) {
        return p;
      }
    }
  }
}
