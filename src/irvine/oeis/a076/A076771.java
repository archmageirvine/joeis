package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076771 Even numbers n representable as the sum of two non-coprime odd composites.
 * @author Sean A. Irvine
 */
public class A076771 extends Sequence1 {

  private long mN = 16;

  private boolean is(final long n) {
    for (long k = 9; 2 * k <= n; k += 2) {
      if (!Predicates.PRIME.is(k) && !Predicates.PRIME.is(n - k) && Functions.GCD.l(k, n - k) != 1) {
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
