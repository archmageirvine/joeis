package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390794 Numbers of the form p^2 - b^2 where p is prime and b &gt; 0.
 * @author Sean A. Irvine
 */
public class A390794 extends Sequence1 {

  private long mN = 2;

  private boolean is(final long n) {
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d * d < n) {
        final long t = d + n / d;
        if ((t & 1) == 0 && Predicates.PRIME.is(t / 2)) {
          return true;
        }
      }
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
