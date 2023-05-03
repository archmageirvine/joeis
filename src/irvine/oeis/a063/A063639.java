package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
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
      if (Jaguar.factor(p.add(1)).bigOmega() == 3) {
        return p;
      }
    }
  }
}
