package irvine.oeis.a290;

import irvine.math.z.Z;
import irvine.oeis.a115.A115004;

/**
 * A290131 Number of regions in a regular drawing of the complete bipartite graph K_{n,n}.
 * @author Georg Fischer
 */
public class A290131 extends A115004 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ZERO : super.next().add((mN - 1) * (mN - 1));
  }
}
