package irvine.oeis.a049;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A049531 Number of digraphs with a source and a sink on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A049531 extends ParallelGenerateGraphsSequence {

  private static final class DigraphCheck extends DirectedGraph {
    private long mCount = 0;

    private long markAll(final Graph g, final long reachable, final int current) {
      if ((reachable & (1L << current)) != 0) {
        return reachable;
      }
      long r = reachable | (1L << current);
      int j = -1;
      while ((j = g.nextVertex(current, j)) >= 0) {
        r |= markAll(g, r, j);
      }
      return r;
    }

    private boolean isSink(final long[] reachable, final int u) {
      final long bit = 1L << u;
      for (final long r : reachable) {
        if ((r & bit) == 0) {
          return false;
        }
      }
      return true;
    }

    private boolean hasSourceAndSink(final Graph g, final long[] reachable) {
      final long all = (1L << g.order()) - 1;
      for (int k = 0; k < g.order(); ++k) {
        if (reachable[k] == all) {
          // found a source, check for sink
          for (int j = 0; j < g.order(); ++j) {
            if (isSink(reachable, j)) {
              return true;
            }
          }
          return false;
        }
      }
      return false;
    }

    @Override
    protected void process(final Graph g) {
      final long[] reachable = new long[g.order()];
      for (int k = 0; k < g.order(); ++k) {
        reachable[k] = markAll(g, 0, k);
      }
      if (hasSourceAndSink(g, reachable)) {
        ++mCount;
      }
    }
  }

  /** Construct the sequence. */
  public A049531() {
    super(0, -1, false, false, false);
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
    if (mN >= 64) {
      throw new UnsupportedOperationException();
    }
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(mN);
    gg.sanitizeParams();
  }
}
