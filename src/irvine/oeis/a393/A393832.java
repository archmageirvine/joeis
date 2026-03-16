package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A393832 Nonnegative integers that have only one largest digit m and the sum of the digits equal to 2*m.
 * @author Sean A. Irvine
 */
public class A393832 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    for (int k = cnts.length - 1; k >= 0; --k) {
      if (cnts[k] > 1) {
        return false;
      }
      if (cnts[k] == 1) {
        int sum = 0;
        for (int j = k - 1; j > 0; --j) {
          sum += cnts[j] * j;
        }
        return sum == k;
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
