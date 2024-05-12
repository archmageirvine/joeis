package irvine.oeis.a059;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059168 Primes in which digits alternately rise and fall (or vice versa); sometimes called undulating primes.
 * @author Sean A. Irvine
 */
public class A059168 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.DIGIT_UNDULATE.is(p)) {
        return p;
      }
    }
  }
}
