package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A078453 Numbers in which all the digits are coprime to each other.
 * @author Sean A. Irvine
 */
public class A078453 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    for (int k = 2; k < 10; ++k) {
      if (cnts[k] > 1 || (cnts[k] > 0 && cnts[0] > 0)) {
        return false;
      }
      for (int j = k + 1; j < 10; ++j) {
        if (cnts[k] > 0 && cnts[j] > 0 && Functions.GCD.i(k, j) > 1) {
          return false;
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

