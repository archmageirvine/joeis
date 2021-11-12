package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a304.A304942;

/**
 * A058783 Number of n-rowed binary matrices with all row sums 4, up to row and column permutation; bipartite graphs with all nodes of degree 4 in a distinguished bipartite n-block, up to isomorphism.
 * @author Sean A. Irvine
 */
public class A058783 extends A304942 {

  private int mN = -1;

  @Override
  public Z next() {
    return blocks(++mN, 4 * mN, 4);
  }
}
