package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052803 Expansion of e.g.f. (-1 + sqrt(1 + 4*log(1-x)))/(2*log(1-x)).
 * @author Sean A. Irvine
 */
public class A052803 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING1.z(mN, k).abs().multiply(Functions.FACTORIAL.z(2 * k)).divide(Functions.FACTORIAL.z(k + 1)));
    }
    return sum;
  }
}
