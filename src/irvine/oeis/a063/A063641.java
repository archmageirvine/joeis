package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
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
      if (Jaguar.factor(p.add(2)).bigOmega() == 3) {
        return p;
      }
    }
  }
}
