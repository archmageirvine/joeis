package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080178 Non-palindromic primes which on subtracting their reversal gives perfect cubes.
 * @author Sean A. Irvine
 */
public class A080178 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z r = Functions.REVERSE.z(p);
      if (r.compareTo(p) < 0 && Predicates.CUBE.is(p.subtract(r))) {
        return p;
      }
    }
  }
}

