package irvine.oeis.a035;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035051 Number of labeled rooted connected graphs where every block is a complete graph.
 * @author Sean A. Irvine
 */
public class A035051 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z nk = Z.ONE;
    for (int k = 0; k < mN; ++k, nk = nk.multiply(mN)) {
      sum = sum.add(Stirling.secondKind(mN - 1, k).multiply(nk));
    }
    return sum;
  }
}
