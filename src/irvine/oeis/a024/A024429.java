package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024429 Expansion of e.g.f. sinh(exp(x)-1).
 * @author Sean A. Irvine
 */
public class A024429 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= (mN - 1) / 2; ++k) {
      sum = sum.add(Functions.STIRLING2.z(mN, 2L * k + 1));
    }
    return sum;
  }
}
