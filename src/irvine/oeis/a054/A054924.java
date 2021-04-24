package irvine.oeis.a054;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054924 Triangle read by rows: T(n,k) = number of nonisomorphic unlabeled connected graphs with n nodes and k edges (n &gt;= 1, 0 &lt;= k &lt;= n(n-1)/2).
 * @author Sean A. Irvine
 */
public class A054924 implements Sequence {

  private int mVertices = 0;
  private int mEdges = 0;

  @Override
  public Z next() {
    if (++mEdges > mVertices * (mVertices - 1) / 2) {
      ++mVertices;
      mEdges = 0;
    }
    return GraphUtils.numberUnlabelledConnectedGraphs(mVertices, mEdges);
  }
}
