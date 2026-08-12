package irvine.oeis.a086;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086259 Primes with at least four digits such that sum of any three_neighbor_digits is prime; first and last digits are neighbors.
 * @author Sean A. Irvine
 */
public class A086259 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    for (long k = 100; k < 1000; ++k) {
      if (Predicates.PRIME.is(Functions.DIGIT_SUM.l(k))) {
        mA.add(Z.valueOf(k));
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      final String s = t.toString();
      final int s1 = s.charAt(s.length() - 1) - '0';
      final int s2 = s.charAt(s.length() - 2) - '0';
      final long v = s1 + s2;
      for (int d = 0; d < 10; ++d) {
        if (Predicates.PRIME.is(v + d)) {
          mA.add(t.multiply(10).add(d));
        }
      }
      if (s.length() > 3
        && Predicates.PRIME.is(s.charAt(0) + s.charAt(1) + s1 - 2 * '0')
        && Predicates.PRIME.is(s.charAt(0) + v - '0')
        && t.isProbablePrime()) {
        return t;
      }
    }
  }
}

