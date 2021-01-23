package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033201 Primes of the form x^2 + 10*y^2.
 * @author Sean A. Irvine
 */
public class A033201 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(40);
      if (r == 1 || r == 9 || r == 11 || r == 19) {
        return p;
      }
    }
  }
}
