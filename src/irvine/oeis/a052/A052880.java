package irvine.oeis.a052;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052880 Expansion of e.g.f.: -LambertW(-exp(x)+1)/(exp(x)-1).
 * @author Sean A. Irvine
 */
public class A052880 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).multiply(Z.valueOf(k + 1).pow(k - 1)));
    }
    return sum;
  }
}
