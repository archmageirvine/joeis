package irvine.oeis.a035;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035051 Number of labeled rooted connected graphs where every block is a complete graph.
 * @author Sean A. Irvine
 */
public class A035051 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z nk = Z.ONE;
    for (int k = 0; k < mN; ++k, nk = nk.multiply(mN)) {
      sum = sum.add(Functions.STIRLING2.z(mN - 1, k).multiply(nk));
    }
    return sum;
  }
}
