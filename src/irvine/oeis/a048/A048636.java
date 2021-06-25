package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048636 Primes of the form prime^3 + 2.
 * @author Sean A. Irvine
 */
public class A048636 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.pow(3).add(2);
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}
