package irvine.oeis.a086;

import java.util.List;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.graph.MaximalCliques;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A086371 a(n) is the sum, over all labeled graphs G on n nodes, of the clique number w(G).
 * @author Sean A. Irvine
 */
public class A086371 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A086371() {
    super(0, 1, 0, ()
      -> graph
      -> Functions.FACTORIAL.z(graph.order()).divide(GraphUtils.automorphismSize(graph)).multiply(max(MaximalCliques.maximalCliques(graph))).longValueExact());
  }

  private static int max(final List<Z> lst) {
    int max = 0;
    for (final Z l : lst) {
      final int cnt = l.bitCount();
      if (cnt > max) {
        max = cnt;
      }
    }
    return max;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(0);
  }
}
