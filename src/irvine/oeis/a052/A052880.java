package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052880 Expansion of e.g.f.: LambertW(1-exp(x))/(1-exp(x)).
 * @author Sean A. Irvine
 */
public class A052880 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING2.z(mN, k).multiply(Z.valueOf(k + 1).pow(k - 1)));
    }
    return sum;
  }
}
