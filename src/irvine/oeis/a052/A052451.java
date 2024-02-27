package irvine.oeis.a052;

import java.util.List;

import irvine.math.graph.Graph;
import irvine.math.graph.MaximalCliques;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A052451 Number of n-node simple graphs having clique number 3.
 * @author Sean A. Irvine
 */
public class A052451 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A052451() {
    super(0, 3, false, false, false);
  }

  private int max(final List<Z> lst) {
    int max = 0;
    for (final Z l : lst) {
      final int cnt = l.bitCount();
      if (cnt > max) {
        max = cnt;
      }
    }
    return max;
  }

  protected int target() {
    return 3;
  }

  @Override
  protected long getCount(final Graph graph) {
    return max(MaximalCliques.maximalCliques(graph)) == target() ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(0);
  }
}
