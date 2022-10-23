package irvine.oeis.a008;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008406 Triangle T(n,k) read by rows, giving number of graphs with n nodes (n &gt;= 1) and k edges (0 &lt;= k &lt;= n(n-1)/2).
 * Implementation derived from Maple code by Brendan McKay.
 * @author Sean A. Irvine
 */
public class A008406 extends Sequence1 {

  private int mN = 0;
  private int mEdgeLimit = 0;
  private int mCurrentEdge = 1;

  @Override
  public Z next() {
    if (++mCurrentEdge > mEdgeLimit) {
      ++mN;
      mEdgeLimit = mN * (mN - 1) / 2;
      mCurrentEdge = 0;
    }
    return GraphUtils.numberUnlabelledGraphs(mN, mCurrentEdge);
  }
}


