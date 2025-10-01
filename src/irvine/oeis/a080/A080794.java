package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A080794 Numbers k whose digits are all contained, in any order, within the digits of prime(k).
 * @author Sean A. Irvine
 */
public class A080794 extends A000040 {

  private long mN = 0;

  private boolean is(final long n, final Z p) {
    final int[] d = ZUtils.digitCounts(n);
    final int[] e = ZUtils.digitCounts(p);
    for (int k = 0; k < d.length; ++k) {
      if (d[k] > e[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN, super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
