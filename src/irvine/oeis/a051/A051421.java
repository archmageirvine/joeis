package irvine.oeis.a051;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A051421 Number of digraphs on n unlabeled nodes with a sink (or, with a source).
 * @author Sean A. Irvine
 */
public class A051421 extends ParallelGenerateGraphsSequence {

  private static final class DigraphCheck extends DirectedGraph {
    private long mCount = 0;

    private long markAll(final Graph g, final long reachable, final int current) {
      final long bit = 1L << current;
      if ((reachable & bit) != 0) {
        return reachable;
      }
      long r = reachable | bit;
      int j = -1;
      while ((j = g.nextVertex(current, j)) >= 0) {
        r |= markAll(g, r, j);
      }
      return r;
    }

    @Override
    protected void process(final Graph g) {
      final long success = (1L << g.order()) - 1;
      for (int k = 0; k < g.order(); ++k) {
        final long reachable = markAll(g, 0L, k);
        if (reachable == success) {
          ++mCount;
          return;
        }
      }
    }
  }

  /** Construct the sequence. */
  public A051421() {
    super(-1, -1, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    final DigraphCheck digraph = new DigraphCheck();
    try {
      digraph.direct(graph, 0, graph.order() - 1, Multigraph.NOLIMIT, false);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return digraph.mCount;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(mN);
    gg.sanitizeParams();
  }

  @Override
  public Z next() {
    return super.next().max(Z.ONE);
  }
}
