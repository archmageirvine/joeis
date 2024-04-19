package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007121 Expansion of e.g.f. ( (1+x)^x )^x.
 * @author Sean A. Irvine
 */
public class A007121 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Stirling.firstKind(mN - 2L * k, k).multiply(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mN - 2 * k))));
    }
    return sum;
  }
}
