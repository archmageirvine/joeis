package irvine.oeis.a014;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014182 Expansion of e.g.f. <code>exp(1-x-exp(-x))</code>.
 * @author Sean A. Irvine
 */
public class A014182 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Stirling.secondKind(mN + 1, k + 1));
    }
    return sum;
  }
}
