package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008271 Number of performances of n fragments in Stockhausen problem.
 * @author Sean A. Irvine
 */
public class A008271 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - 1, k).multiply(k).multiply(2L * k - 1).multiply(Functions.FACTORIAL.z(2 * k)).shiftRight(k));
    }
    return sum.multiply(mN);
  }
}

