package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063645 Primes with two representations: p*q*r - 2 = u*v*w + 2 where p, q, r, u, v and w are primes (not necessarily distinct).
 * @author Sean A. Irvine
 */
public class A063645 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Jaguar.factor(p.subtract(2)).bigOmega() == 3 && Jaguar.factor(p.add(2)).bigOmega() == 3) {
        return p;
      }
    }
  }
}
