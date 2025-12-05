package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390986 Integers k such that all prime factors of k^2+1 are Sophie Germain primes.
 * @author Sean A. Irvine
 */
public class A390986 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    for (final Z p : Jaguar.factor(Z.valueOf(n).square().add(1)).toZArray()) {
      if (!Predicates.SOPHIE_GERMAIN.is(p)) {
        return false;
      }
    }
    return true;
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
