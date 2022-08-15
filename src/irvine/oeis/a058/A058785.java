package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a304.A304942;

/**
 * A058785 Number of n-rowed binary matrices with all row sums 6, up to row and column permutation; bipartite graphs with all nodes of degree 6 in a distinguished bipartite n-block, up to isomorphism.
 * @author Sean A. Irvine
 */
public class A058785 extends A304942 {

  private int mN = -1;

  @Override
  public Z next() {
    return blocks(++mN, 6 * mN, 6);
  }
}
