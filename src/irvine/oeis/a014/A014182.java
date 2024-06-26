package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014182 Expansion of e.g.f. exp(1-x-exp(-x)).
 * @author Sean A. Irvine
 */
public class A014182 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Functions.STIRLING2.z(mN + 1, k + 1));
    }
    return sum;
  }
}
