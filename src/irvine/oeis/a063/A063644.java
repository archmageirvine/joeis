package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063644 Primes with 2 representations: p*q*r - 1 = u*v*w + 1 where p, q, r, u, v and w are primes.
 * @author Sean A. Irvine
 */
public class A063644 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.BIG_OMEGA.l(p.subtract(1)) == 3 && Functions.BIG_OMEGA.l(p.add(1)) == 3) {
        return p;
      }
    }
  }
}
