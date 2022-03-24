package irvine.oeis.a055;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055482 There exists some k&gt;0 such that n is the product of (k + digits of n).
 * @author Sean A. Irvine
 */
public class A055482 implements Sequence {

  private long mN = 11;

  private boolean is(final long n, final long m, final int[] counts) {
    long prod = 1;
    for (int k = 9; k >= 0; --k) {
      if (counts[k] > 0) {
        prod *= LongUtils.pow(k + m, counts[k]);
        if (prod > n) {
          return false;
        }
      }
    }
    return prod == n;
  }

  private boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    for (long k = 1; k <= n; ++k) {
      if (is(n, k, cnts)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
