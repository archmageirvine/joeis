package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007106 Number of labeled odd degree trees with 2n nodes.
 * @author Sean A. Irvine
 */
public class A007106 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 2) {
      return Z.ONE;
    }
    Z sum1 = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum1 = sum1.add(Binomial.binomial(mN, k).multiply(Z.valueOf(mN - 2 * k).pow(mN - 2)));
    }
    sum1 = sum1.multiply(mN - 1).multiply(mN);
    Z sum2 = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum2 = sum2.add(Binomial.binomial(mN - 1, k).multiply(Z.valueOf(mN - 2 * k).pow(mN - 3)));
    }
    sum2 = sum2.multiply(mN - 2).multiply(mN - 1).multiply(mN);
    return sum1.subtract(sum2.multiply2()).shiftRight(mN + 1).divide(mN - 1);
  }
}
