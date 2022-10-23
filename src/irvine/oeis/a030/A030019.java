package irvine.oeis.a030;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030019 Number of labeled spanning trees in the complete hypergraph on n vertices (all hyperedges having cardinality 2 or greater).
 * @author Sean A. Irvine
 */
public class A030019 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z nk = Z.ONE;
    for (int k = 1; k < mN; ++k, nk = nk.multiply(mN)) {
      sum = sum.add(Stirling.secondKind(mN - 1, k).multiply(nk));
    }
    return sum;
  }
}
