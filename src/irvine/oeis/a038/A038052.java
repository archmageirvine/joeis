package irvine.oeis.a038;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038052 Number of labeled trees of nonempty sets with n points. (Each node is a set of 1 or more points.).
 * @author Sean A. Irvine
 */
public class A038052 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).multiply(Z.valueOf(k).pow(k - 2)));
    }
    return sum;
  }
}
