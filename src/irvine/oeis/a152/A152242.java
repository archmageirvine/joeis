package irvine.oeis.a152;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A152242 Integers formed by concatenating primes.
 * @author Sean A. Irvine
 */
public class A152242 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    if (Predicates.PRIME.is(n)) {
      return true;
    }
    long m1 = 1;
    long m = 10;
    while (m < n) {
      final long r = n % m;
      if (r > m1 && Predicates.PRIME.is(r) && is(n / m)) {
        return true;
      }
      m1 = m;
      m *= 10;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
