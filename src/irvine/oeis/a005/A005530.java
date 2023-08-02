package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005530 Number of Boolean functions of n variables from Post class F(8,inf); number of degenerate Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A005530 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= mN; ++j) {
      sum = sum.signedAdd((j & 1) == 1, Binomial.binomial(mN, j).shiftLeft(1L << (mN - j)));
    }
    return sum;
  }
}
