package irvine.oeis.a046;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046751 Triangle read by rows of number of connected graphs with n nodes and k edges (n &gt;= 2, 1 &lt;= k &lt;= n(n-1)/2).
 * @author Sean A. Irvine
 */
public class A046751 implements Sequence {

  private int mVertices = 1;
  private int mEdges = 0;

  @Override
  public Z next() {
    if (++mEdges > mVertices * (mVertices - 1) / 2) {
      ++mVertices;
      mEdges = 1;
    }
    return GraphUtils.numberUnlabelledConnectedGraphs(mVertices, mEdges);
  }
}
