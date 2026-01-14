package irvine.oeis.a259;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A259366 Numbers for which the differences between consecutive divisors (ordered by size) are not distinct.
 * @author Sean A. Irvine
 */
public class A259366 extends Sequence1 {

  private long mN = 5;

  private boolean is(final long n) {
    Z prev = null;
    final HashSet<Z> seen = new HashSet<>();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (prev != null && !seen.add(d.subtract(prev))) {
        return true;
      }
      prev = d;
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

