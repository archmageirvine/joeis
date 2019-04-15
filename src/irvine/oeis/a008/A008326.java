package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008326 Triangle read by rows: <code>T(n,k)</code> is the number of simple regular connected bipartite graphs with <code>2n</code> nodes and degree <code>k, (2 &lt;= k &lt;= n)</code>.
 * @author Sean A. Irvine
 */
public class A008326 implements Sequence {

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


