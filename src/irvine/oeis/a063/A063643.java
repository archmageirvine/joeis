package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063643 Primes with 2 representations: p*q - 2 = u*v + 2 where p, q, u and v are primes.
 * @author Sean A. Irvine
 */
public class A063643 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Jaguar.factor(p.add(2)).isSemiprime() && Jaguar.factor(p.subtract(2)).isSemiprime()) {
        return p;
      }
    }
  }
}
