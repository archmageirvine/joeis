package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A020665 a(n) is the (conjectured) maximal exponent k such that n^k does not contain a digit zero in its decimal expansion.
 * @author Sean A. Irvine
 */
public class A020665 implements Sequence {

  // Partially conjectural
  // 99 is large enough for all known results
  private static final int HEURISTIC_LIMIT = 1000;

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN % 10 == 0 || mN % 100 == 1) {
      return Z.ZERO;
    }
    int best = 0;
    Z t = Z.valueOf(mN);
    for (int m = 2; m <= HEURISTIC_LIMIT; ++m) {
      t = t.multiply(mN);
      if (!ZUtils.containsZero(t)) {
        best = m;
      }
    }
    return Z.valueOf(best);
  }
}
