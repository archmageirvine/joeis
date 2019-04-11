package irvine.oeis.a003;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003466 Number of minimal covers of <code>an</code> n-set that have exactly one point which appears in more than one set in the cover.
 * @author Sean A. Irvine
 */
public class A003466 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN - 1, k).multiply(Z.ONE.shiftLeft(k).subtract(k + 1)));
    }
    return sum.multiply(mN);
  }
}
