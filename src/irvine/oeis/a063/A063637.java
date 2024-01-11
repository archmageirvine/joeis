package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063637 Primes p such that p+2 is a semiprime.
 * @author Sean A. Irvine
 */
public class A063637 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Jaguar.factor(p.add(2)).isSemiprime()) {
        return p;
      }
    }
  }
}
