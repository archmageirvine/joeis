package irvine.oeis.a049;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A049524.
 * @author Sean A. Irvine
 */
public class A049524 extends A049414 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = s(++mN);
    for (int k = 1; k <= mN; ++k) {
      Z s = Z.ZERO;
      for (int j = 1; j <= mN - k; ++j) {
        s = s.add(Binomial.binomial(mN - k, j).multiply(lambdaBar(k, j, mN - k - j)).multiply(s(j)));
      }
      sum = sum.add(s.multiply(Binomial.binomial(mN, k)).multiply(s(k)));
    }
    return sum;
  }
}
