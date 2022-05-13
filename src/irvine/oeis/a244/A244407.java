package irvine.oeis.a244;
// manually A244372/trionk

import irvine.math.z.Z;

/**
 * A244407 Number of unlabeled rooted trees with 2n nodes and maximal outdegree (branching factor) n.
 * @author Georg Fischer
 */
public class A244407 extends A244372 {

  private int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    // a:= n-> b(2*n-1$2, n$2)-b(2*n-1$2, n-1$2):
    return mSeq.mB.get(2 * mN - 1, 2 * mN - 1, mN, mN).subtract(mSeq.mB.get(2 * mN - 1, 2 * mN - 1, mN - 1, mN - 1));
  }
}
