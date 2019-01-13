package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a004.A004251;

/**
 * A007721.
 * @author Sean A. Irvine
 */
public class A007721 extends A004251 {

  // Based on the Kai Wang paper

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final int bigN = mN * (mN - 1);
    Z sum = Z.ZERO;
    for (int i = 2 * (mN - 1); i <= bigN; i += 2) {
      for (int j = 1; j <= Math.min(mN - 1, i - mN + 1); ++j) {
        sum = sum.add(get(i - j - mN + 1, j - 1, mN - 1, mN - j - 1));
      }
    }
    return sum;
  }

}
