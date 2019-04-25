package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005530 Number of Boolean functions of n variables from Post class <code>F(8</code>,inf); number of degenerate Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A005530 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= mN; ++j) {
      sum = sum.signedAdd((j & 1) == 1, Binomial.binomial(mN, j).shiftLeft(1 << (mN - j)));
    }
    return sum;
  }
}
