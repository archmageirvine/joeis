package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007113 Expansion of e.g.f. (1 + x)^x.
 * @author Sean A. Irvine
 */
public class A007113 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Functions.FACTORIAL.z(k)).multiply(Functions.STIRLING1.z(mN - k, k)));
    }
    return sum;
  }
}
