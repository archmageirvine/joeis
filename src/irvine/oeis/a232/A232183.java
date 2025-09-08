package irvine.oeis.a232;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A232183 Primes p such that p-R(p) is a square, where R = reversal of digits = A004086.
 * @author Sean A. Irvine
 */
public class A232183 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z r = Functions.REVERSE.z(p);
      if (r.compareTo(p) <= 0 && Predicates.SQUARE.is(p.subtract(r))) {
        return p;
      }
    }
  }
}

