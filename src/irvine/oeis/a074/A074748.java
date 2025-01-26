package irvine.oeis.a074;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074748 Numbers for which the differences between consecutive anti-divisors (ordered by size) are not distinct.
 * @author Sean A. Irvine
 */
public class A074748 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long k = 0;
    final HashSet<Long> diffs = new HashSet<>();
    for (long d = 2; d < n; ++d) {
      if (A074746.isAntidivisor(d, n)) {
        if (k != 0) {
          final long delta = d - k;
          if (!diffs.add(delta)) {
            return true;
          }
        }
        k = d;
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
