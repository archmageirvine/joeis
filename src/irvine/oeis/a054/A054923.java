package irvine.oeis.a054;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054923 Triangle read by rows: number of connected graphs with k &gt;= 0 edges and n nodes (1&lt;=n&lt;=k+1).
 * @author Sean A. Irvine
 */
public class A054923 extends Sequence0 {

  private int mVertices = 0;
  private int mEdges = -1;

  @Override
  public Z next() {
    if (++mVertices > mEdges + 1) {
      ++mEdges;
      mVertices = 1;
    }
    return GraphUtils.numberUnlabelledConnectedGraphs(mVertices, mEdges);
  }
}
