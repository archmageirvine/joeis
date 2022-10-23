package irvine.oeis.a052;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052807 E.g.f.: -LambertW(log(1-x)).
 * @author Sean A. Irvine
 */
public class A052807 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).abs().multiply(Z.valueOf(k).pow(k - 1)));
    }
    return sum;
  }
}
