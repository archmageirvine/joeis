package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A038565 Number of times digits are repeated in A038564.
 * @author Sean A. Irvine
 */
public class A038565 extends A038564 {

  private long mN = 54022;

  @Override
  public Z next() {
    while (true) {
      final int[] cnt = new int[10];
      for (final Z d : Cheetah.factor(++mN).divisors()) {
        final int[] c = ZUtils.digitCounts(d);
        for (int k = 0; k < c.length; ++k) {
          cnt[k] += c[k];
        }
      }
      if (isConstant(cnt)) {
        return Z.valueOf(cnt[1]);
      }
    }
  }
}
