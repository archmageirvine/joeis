package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A069715 GCD of digits of n is 1.
 * @author Sean A. Irvine
 */
public class A069715 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int[] cnts = ZUtils.digitCounts(++mN);
      if (cnts[1] > 0) {
        return Z.valueOf(mN);
      }
      int g = 0;
      for (int k = 2; k < cnts.length; ++k) {
        if (cnts[k] > 0) {
          g = g == 0 ? k : Functions.GCD.i(g, k);
          if (g == 1) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

