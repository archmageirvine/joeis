package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A065099 Weight 5 level 11 cusp form with complex multiplication by <code>Q(sqrt(11))</code> and trivial character.
 * @author Sean A. Irvine
 */
public class A065099 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 4;
    final Z n = Z.valueOf(mN);
    Z sum = Z.ZERO;
    for (long y = 0; y <= LongUtils.sqrt(mN / 11); ++y) {
      final long x = mN - 11 * y * y;
      final long s = LongUtils.sqrt(x);
      if (s * s  == x) {
        final long mul = y > 0 && mN > 11 * y * y ? 2 : 1;
        final Z t = n.square().subtract(n.multiply(y * y).multiply(88)).add(Z.valueOf(y).pow(4).multiply(968));
        sum = sum.add(t.multiply(mul).divide(16));
      }
    }
    return sum;
  }
}
