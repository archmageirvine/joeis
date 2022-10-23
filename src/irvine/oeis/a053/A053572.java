package irvine.oeis.a053;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053572 Maximal number of spanning trees in a planar graph with n nodes.
 * @author Sean A. Irvine
 */
public class A053572 extends Sequence0 implements GraphProcessor {

  private int mN = -1;
  private Z mMax = Z.ZERO;

  @Override
  public void process(final Graph graph) {
    if (graph.isPlanar()) {
      final Z trees = GraphUtils.numberOfSpanningTrees(graph);
      if (trees.compareTo(mMax) > 0) {
        mMax = trees;
      }
    }
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    mMax = Z.ZERO;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Integer.MAX_VALUE);
    gg.setConnectionLevel(1);
    gg.setProcessor(this);
    gg.sanitizeParams();
    gg.run(false, false, false, 0, 0);
    return mMax;
  }
}
