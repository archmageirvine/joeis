package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076770 Even numbers representable as the sum of two odd composites.
 * @author Sean A. Irvine
 */
public class A076770 extends Sequence1 {

  private long mN = 16;

  private boolean is(final long n) {
    for (long k = 9; 2 * k <= n; k += 2) {
      if (!Predicates.PRIME.is(k) && !Predicates.PRIME.is(n - k)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
