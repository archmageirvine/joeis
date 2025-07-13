package irvine.oeis.a066;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066546 Number of spanning trees in the line graph of the box product of two (2 x n) grid graphs.
 * @author Sean A. Irvine
 */
public class A066546 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Graph g = GraphFactory.grid(2, ++mN);
    return GraphUtils.numberOfSpanningTrees(GraphUtils.boxProduct(g, g).lineGraph());
  }
}
