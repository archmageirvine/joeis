package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A045869 In the list of divisors of n (in base 5), each digit 0-4 appears equally often.
 * @author Sean A. Irvine
 */
public class A045869 implements Sequence {

  private long mN = 1;

  protected boolean isConstant(final int[] cnt) {
    final int c = cnt[0];
    for (int k = 1; k < cnt.length; ++k) {
      if (cnt[k] != c) {
        return false;
      }
    }
    return true;
  }

  protected int base() {
    return 5;
  }

  @Override
  public Z next() {
    while (true) {
      final int[] cnt = new int[base()];
      for (final Z d : Cheetah.factor(++mN).divisors()) {
        final int[] c = ZUtils.digitCounts(d, base());
        for (int k = 0; k < c.length; ++k) {
          cnt[k] += c[k];
        }
      }
      if (isConstant(cnt)) {
        return new Z(Long.toString(mN, base()));
      }
    }
  }
}
