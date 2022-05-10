package irvine.oeis.a244;
// manually A244372/trionk

import irvine.math.z.Z;

/**
 * A244410 Number of unlabeled rooted trees with 2n+1 nodes and maximal outdegree (branching factor) n.
 * @author Georg Fischer
 */
public class A244410 extends A244372 {

  private int mN = - 1;
  
  @Override
  public Z next() {
    ++mN;
    // a:= n-> `if`(n=0, 1, b(2*n$2, n$2)-b(2*n$2, n-1$2)):
    return mN == 0 ? Z.ONE : mB.get(2 * mN, 2 * mN, mN, mN).subtract(mB.get(2 * mN, 2 * mN, mN - 1, mN - 1));
  }
}
