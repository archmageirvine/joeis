package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063639 Primes of the form p*q*r - 1, where p, q and r are primes (not necessarily distinct).
 * @author Sean A. Irvine
 */
public class A063639 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.BIG_OMEGA.l(p.add(1)) == 3) {
        return p;
      }
    }
  }
}
