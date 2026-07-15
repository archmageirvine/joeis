package irvine.oeis.a258;

import java.util.Map;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;
import irvine.util.Pair;

/**
 * A258400 Perfect powers m^k such that m, k and m+k are primes.
 * @author Sean A. Irvine
 */
public class A258400 extends A000961 {

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, Pair<Long, Long>> e = nextEntry();
      final Pair<Long, Long> s = e.getValue();
      if (Predicates.PRIME.is(s.right()) && Predicates.PRIME.is(s.left() + s.right())) {
        return e.getKey();
      }
    }
  }
}

