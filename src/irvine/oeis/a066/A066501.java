package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066501 Numbers k such that x^6 == 1 (mod(k)) has no solution 1 &lt; x &lt; k-1.
 * @author Sean A. Irvine
 */
public class A066501 extends Sequence1 {

  private long mN = 0;

  private boolean hasNoSolution(final long n) {
    for (long k = 2; k < n - 1; ++k) {
      if (LongUtils.modPow(k, 6, n) == 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (hasNoSolution(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
