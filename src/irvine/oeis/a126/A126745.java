package irvine.oeis.a126;

import java.util.List;

import irvine.math.graph.MaximalCliques;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A126745 Number of connected graphs on n nodes with clique number 3.
 * @author Sean A. Irvine
 */
public class A126745 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A126745() {
    super(0, 3, false, false, false, false, () -> graph -> max(MaximalCliques.maximalCliques(graph)) == 3 ? 1 : 0);
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
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
  }
}
