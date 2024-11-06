package irvine.oeis.a063;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063638 Primes p such that p-2 is a semiprime.
 * @author Sean A. Irvine
 */
public class A063638 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.SEMIPRIME.is(p.subtract(2))) {
        return p;
      }
    }
  }
}
