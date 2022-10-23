package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A054484 Numbers not divisible by any of their digits when written in base 7.
 * @author Sean A. Irvine
 */
public class A054484 extends Sequence1 {

  private long mN = 16;

  @Override
  public Z next() {
    outer:
    while (true) {
      final int[] cnts = ZUtils.digitCounts(++mN, 7);
      for (int k = 1; k < cnts.length; ++k) {
        if (cnts[k] > 0 && mN % k == 0) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
