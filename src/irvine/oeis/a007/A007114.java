package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007114 Expansion of e.g.f. (1 - x)^x.
 * @author Sean A. Irvine
 */
public class A007114 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Functions.STIRLING1.z(k, mN - k).multiply(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k))));
    }
    return sum;
  }
}
