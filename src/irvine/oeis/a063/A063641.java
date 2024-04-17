package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063641 Primes of form p*q*r - 2, where p, q and r are primes (not necessarily distinct).
 * @author Sean A. Irvine
 */
public class A063641 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.BIG_OMEGA.l(p.add(2)) == 3) {
        return p;
      }
    }
  }
}
