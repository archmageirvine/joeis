package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008327 Triangle read by rows: T(n,k) is the number of simple regular bipartite graphs with 2n nodes and degree k, (0 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A008327 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
    }
    return new A008323.RegularConnectedBipartiteGenerator(mN, mM, false).next();
  }
}


