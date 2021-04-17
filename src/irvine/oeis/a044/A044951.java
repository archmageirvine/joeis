package irvine.oeis.a044;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A044951 Numbers having a different number of ones and zeros in base 2.
 * @author Sean A. Irvine
 */
public class A044951 implements Sequence {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  private boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(n, base());
    for (int k = 0; k < cnts.length; ++k) {
      if (cnts[k] > 0) {
        for (int j = k + 1; j < cnts.length; ++j) {
          if (cnts[k] == cnts[j]) {
            return false;
          }
        }
      }
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

