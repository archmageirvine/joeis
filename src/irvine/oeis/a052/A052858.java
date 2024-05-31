package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052858 E.g.f.: log(-1/(-1+x*exp(x)-x)).
 * @author Sean A. Irvine
 */
public class A052858 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mN - k)).multiply(Functions.STIRLING2.z(mN - k, k).multiply(Functions.FACTORIAL.z(k - 1))));
    }
    return sum;
  }
}

