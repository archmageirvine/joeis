package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049003 Primes of form p^3 - 4, p prime.
 * @author Sean A. Irvine
 */
public class A049003 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.pow(3).subtract(4);
      if (q.isProbablePrime()) {
        return q;
      }
    }
  }
}
