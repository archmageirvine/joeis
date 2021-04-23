package irvine.oeis.a054;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054924.
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
