package irvine.oeis.a060;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060683 Numbers for which the differences between consecutive divisors (ordered by size) are distinct.
 * @author Sean A. Irvine
 */
public class A060683 extends Sequence2 {

  private long mN = 0;

  private boolean is(final long n) {
    Z prev = Z.ZERO;
    final HashSet<Z> diffs = new HashSet<>();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (!prev.isZero() && ! diffs.add(d.subtract(prev))) {
        return false;
      }
      prev = d;
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
