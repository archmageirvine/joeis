package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033199 Primes of form <code>x^2+6*y^2</code>.
 * @author Sean A. Irvine
 */
public class A033199 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(24);
      if (r == 1 || r == 7) {
        return p;
      }
    }
  }
}
