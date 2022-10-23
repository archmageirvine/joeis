package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A058225 Numbers that are inconsummate to some base.
 * @author Sean A. Irvine
 */
public class A058225 extends Sequence1 {

  // Cf. A003634
  private static final long HEURISTIC_LIMIT = 10; // Is this provably enough?

  private long mN = 12;

  private boolean isInconsummate(final long n, final long base) {
    for (long m = n; m < HEURISTIC_LIMIT * n * n; m += n) {
      if (m == n * ZUtils.digitSum(m, base)) {
        return false;
      }
    }
    return true;
  }

  private boolean isInconsummate(final long n) {
    for (long base = 2; base < n; ++base) {
      if (isInconsummate(n, base)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (isInconsummate(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
