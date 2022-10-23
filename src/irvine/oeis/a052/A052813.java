package irvine.oeis.a052;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052813 Expansion of e.g.f.: LambertW(log(1-x))/log(1-x).
 * @author Sean A. Irvine
 */
public class A052813 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).abs().multiply(Z.valueOf(k + 1).pow(k - 1)));
    }
    return sum;
  }
}
