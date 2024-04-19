package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052865 E.g.f.: log(-1/(-1+x))^2 / (-1 + log(-1/(-1+x)))^2.
 * @author Sean A. Irvine
 */
public class A052865 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Functions.FACTORIAL.z(k).multiply(k - 1).multiply(Stirling.firstKind(mN, k)));
    }
    return sum;
  }
}
