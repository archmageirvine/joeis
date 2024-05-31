package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A003466 Number of minimal covers of an n-set that have exactly one point which appears in more than one set in the cover.
 * @author Sean A. Irvine
 */
public class A003466 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Functions.STIRLING2.z(mN - 1, k).multiply(Z.ONE.shiftLeft(k).subtract(k + 1)));
    }
    return sum.multiply(mN);
  }
}
