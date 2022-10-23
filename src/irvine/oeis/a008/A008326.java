package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A008326 Triangle read by rows: T(n,k) is the number of simple regular connected bipartite graphs with 2n nodes and degree k, (2 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A008326 extends Sequence2 {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = Math.min(2, mN);
    }
    return new A008323.RegularConnectedBipartiteGenerator(mN, mM, true).next();
  }
}


