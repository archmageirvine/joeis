package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006676 Number of paths through an array.
 * @author Sean A. Irvine
 */
public class A006676 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 3; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(k, 3).multiply(Stirling.firstKind(mN + 1, mN + 1 - k)).multiply(Z.valueOf(mN).pow(mN - k)));
    }
    return sum.negate();
  }

}
