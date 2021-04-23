package irvine.oeis.a046;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046742.
 * @author Sean A. Irvine
 */
public class A046742 implements Sequence {

  private int mVertices = 1;
  private int mEdges = 0;

  @Override
  public Z next() {
    if (++mVertices > mEdges + 1) {
      ++mEdges;
      mVertices = 2;
    }
    return GraphUtils.numberUnlabelledConnectedGraphs(mVertices, mEdges);
  }
}
