package irvine.oeis.a388;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388051 allocated for Paul Duckett.
 * @author Sean A. Irvine
 */
public class A388051 extends Sequence1 {

  private long mN = 35;

  private boolean is(final long n) {
    boolean seen = false;
    for (long k = 2; k * k < n; ++k) {
      if (!Predicates.POWER.is(k)) {
        long j = k;
        while (2 * (j *= k) <= n) {
          if (Predicates.POWER.is(n - j)) {
            if (seen) {
              return true;
            }
            seen = true;
          }
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
