package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024430 Expansion of e.g.f. cosh(exp(x)-1).
 * @author Sean A. Irvine
 */
public class A024430 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(Stirling.secondKind(mN, 2 * k));
    }
    return sum;
  }
}
