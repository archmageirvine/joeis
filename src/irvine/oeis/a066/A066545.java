package irvine.oeis.a066;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066545 Number of spanning trees in the line graph of the product of two complete graph, each of order n, L(K_n x K_n).
 * @author Sean A. Irvine
 */
public class A066545 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    final Graph g = GraphFactory.complete(++mN);
    return GraphUtils.numberOfSpanningTrees(GraphUtils.boxProduct(g, g).lineGraph());
  }
}
