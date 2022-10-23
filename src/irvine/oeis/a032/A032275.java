package irvine.oeis.a032;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032275 Number of bracelets (turnover necklaces) of n beads of 4 colors.
 * @author Sean A. Irvine
 */
public class A032275 extends Sequence1 {

  private int mN = 0;

  protected int colors() {
    return 4;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z kd = Z.ONE;
    for (long d = 1; d <= mN; ++d) {
      kd = kd.multiply(colors());
      if (mN % d == 0) {
        sum = sum.add(kd.multiply(LongUtils.phi(mN / d)));
      }
    }
    sum = sum.divide(mN);
    final Z c = Z.valueOf(colors());
    return sum.add(c.pow((mN + 1) / 2).add(c.pow((mN + 2) / 2)).divide2()).divide2();
  }
}
