package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067889 Primes sandwiched between two numbers having same number of divisors.
 * @author Sean A. Irvine
 */
public class A067889 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Jaguar.factor(p.subtract(1)).sigma0().equals(Jaguar.factor(p.add(1)).sigma0())) {
        return p;
      }
    }
  }
}
