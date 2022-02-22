package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054865 Numbers not divisible by any of their digits when written in base 9.
 * @author Sean A. Irvine
 */
public class A054865 implements Sequence {

  private long mN = 22;

  @Override
  public Z next() {
    outer:
    while (true) {
      final int[] cnts = ZUtils.digitCounts(++mN, 9);
      for (int k = 1; k < cnts.length; ++k) {
        if (cnts[k] > 0 && mN % k == 0) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
