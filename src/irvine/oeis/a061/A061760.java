package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061760 extends Sequence1 {

  private long mN = 0;

  private boolean is(final int[] a, final int[] b) {
    for (int k = 0; k < a.length; ++k) {
      if (a[k] > b[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final int[] syn = ZUtils.digitCounts(++mN);
    long m = mN;
    long lim = 10;
    long k = 1;
    while (true) {
      m += mN;
      if (++k == lim) {
        lim *= 10;
      } else if (is(syn, ZUtils.digitCounts(m))) {
        return Z.valueOf(m);
      }
    }
  }
}
