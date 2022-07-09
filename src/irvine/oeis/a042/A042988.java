package irvine.oeis.a042;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A042988 Primes not congruent to -1 (mod 7).
 * @author Sean A. Irvine
 */
public class A042988 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(7) != 6) {
        return p;
      }
    }
  }
}
