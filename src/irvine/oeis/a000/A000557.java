package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000557 Expansion of e.g.f.: 1/(1-2*sinh(x)).
 * @author Sean A. Irvine
 */
public class A000557 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Functions.FACTORIAL.z(k)
                .multiply(Functions.FIBONACCI.z(k + 2))
                .multiply(Functions.STIRLING2.z(mN, k)));
    }
    return s;
  }
}
