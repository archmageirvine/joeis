package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
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
      if (Jaguar.factor(p.subtract(1)).bigOmega() == 3 && Jaguar.factor(p.add(1)).bigOmega() == 3) {
        return p;
      }
    }
  }
}
