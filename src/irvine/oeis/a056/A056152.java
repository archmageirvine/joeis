package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a028.A028657;

/**
 * A056152 Triangular array giving number of bipartite graphs with n vertices, no isolated vertices and a distinguished bipartite block with k=1..n-1 vertices, up to isomorphism.
 * @author Sean A. Irvine
 */
public class A056152 extends A028657 {

  @Override
  protected Z a(final int n, final int k) {
    return super.a(n, k).subtract(super.a(n - 1, k)).subtract(super.a(n, k - 1)).add(super.a(n - 1, k - 1));
  }

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return a(mM, mN - mM);
  }
}

