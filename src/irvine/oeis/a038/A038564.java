package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038564 In the list of divisors of n, each digit 1-9 appears equally often.
 * @author Sean A. Irvine
 */
public class A038564 implements Sequence {

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
      for (final Z d : Cheetah.factor(++mN).divisors()) {
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
