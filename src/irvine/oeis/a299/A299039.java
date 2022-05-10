package irvine.oeis.a299;
// manually A244372/trionk

import irvine.math.z.Z;

/**
 * A299039 Number of rooted trees with 2n nodes where each node has at most n children.
 * @author Georg Fischer
 */
public class A299039 extends A299038 {

  private int mN = - 1;
  
  @Override
  public Z next() {
    ++mN;
    // a:= n-> `if`(n=0, 1, b(2*n-1$2, n$2)):
    return mN == 0 ? Z.ONE : mB.get(2 * mN - 1, 2 * mN - 1, mN, mN);
  }
}

