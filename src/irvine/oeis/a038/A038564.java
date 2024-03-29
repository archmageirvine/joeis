package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038564 Numbers whose list of divisors includes each digit 1-9 equally often.
 * @author Sean A. Irvine
 */
public class A038564 extends Sequence1 {

  private long mN = 54022;

  protected boolean isConstant(final int[] cnt) {
    final int c = cnt[1];
    for (int k = 2; k < cnt.length; ++k) {
      if (cnt[k] != c) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final int[] cnt = new int[10];
      for (final Z d : Jaguar.factor(++mN).divisors()) {
        final int[] c = ZUtils.digitCounts(d);
        for (int k = 0; k < c.length; ++k) {
          cnt[k] += c[k];
        }
      }
      if (isConstant(cnt)) {
        return Z.valueOf(mN);
      }
    }
  }
}
