package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A391002 Smallest positive integer k such that k^n contains each digit of k exactly n times, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A391002 extends Sequence1 {

  private int mN = 0;

  private boolean is(final int[] d1, final int[] d2, final int n) {
    for (int k = 0; k < d1.length; ++k) {
      if (d1[k] * n != d2[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final int[] d1 = ZUtils.digitCounts(++k);
      final int[] d2 = ZUtils.digitCounts(Z.valueOf(k).pow(mN));
      if (is(d1, d2, mN)) {
        return Z.valueOf(k);
      }
    }
  }
}

