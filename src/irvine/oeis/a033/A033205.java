package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033205 Primes of form <code>x^2 + 5*y^2</code>.
 * @author Sean A. Irvine
 */
public class A033205 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(20);
      if (r == 1 || r == 5 || r == 9) {
        return p;
      }
    }
  }
}

