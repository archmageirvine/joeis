package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081932 Sum of n-th row of A081930.
 * @author Sean A. Irvine
 */
public class A081932 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 1; m <= mN; ++m) {
      final String s = Z.TEN.pow((mN - 1) / 2).add(m).subtract(mN == 1 ? 2 : 1).toString();
      sum = sum.add(new Z(s + new StringBuilder(s).reverse().substring(mN & 1)));
    }
    return sum;
  }
}
