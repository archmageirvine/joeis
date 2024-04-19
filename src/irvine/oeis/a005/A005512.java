package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005512 Number of series-reduced labeled trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005512 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN - 2; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(Functions.FACTORIAL.z(mN - 2)).multiply(Z.valueOf(mN - k).pow(mN - k - 2)).divide(Functions.FACTORIAL.z(mN - k - 2)));
    }
    return sum;
  }
}
