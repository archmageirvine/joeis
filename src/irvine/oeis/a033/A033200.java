package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033200 Primes congruent to <code>{1, 3} mod 8;</code> or, odd primes of form <code>x^2+2*y^2</code>.
 * @author Sean A. Irvine
 */
public class A033200 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(8);
      if (r == 1 || r == 3) {
        return p;
      }
    }
  }
}
