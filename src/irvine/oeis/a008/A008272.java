package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A008272 Total length of performances of n fragments in Stockhausen problem.
 * @author Sean A. Irvine
 */
public class A008272 extends A008271 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN - 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - 2, k).multiply(Z.TWO.multiply(k).add(3).multiply(k).add(2)).multiply(2L * k + 1).multiply(mF.factorial(2 * k + 1)).shiftRight(k));
    }
    return sum.multiply(mN).multiply(mN - 1).add(super.next().multiply(3));
  }
}

