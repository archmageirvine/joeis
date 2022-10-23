package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A005323 Column of Motzkin triangle.
 * @author Sean A. Irvine
 */
public class A005323 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = (mN - 2) / 2; k <= mN + 1; ++k) {
      sum = sum.add(Binomial.binomial(k, 2 * k - mN + 3).multiply(Binomial.binomial(mN + 1, k)));
    }
    return sum.multiply(4).divide(mN + 1);
  }
}
