package irvine.math.function;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * Prime memory function.
 * @author Sean A. Irvine
 */
class PrimeMemory extends AbstractFunction1 {

  @Override
  public long l(final Z n) {
    final String s = n.toString();
    final TreeSet<Long> primes = new TreeSet<>();
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) != '0') {
        for (int j = k + 1; j <= s.length(); j++) {
          final long t = Long.parseLong(s.substring(k, j));
          if (Predicates.PRIME.is(t)) {
            primes.add(t);
          }
        }
      }
    }
    return primes.size();
  }

  @Override
  public Z z(final Z n) {
    return Z.valueOf(l(n));
  }
}
