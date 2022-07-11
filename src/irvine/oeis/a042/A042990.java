package irvine.oeis.a042;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A042990 Primes not congruent to 4 (mod 7).
 * @author Sean A. Irvine
 */
public class A042990 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(7) != 4) {
        return p;
      }
    }
  }
}
