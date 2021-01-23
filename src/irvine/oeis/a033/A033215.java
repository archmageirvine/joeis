package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033215 Primes of form x^2+21*y^2.
 * @author Sean A. Irvine
 */
public class A033215 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(84);
      if (r == 1 || r == 25 || r == 37) {
        return p;
      }
    }
  }
}
