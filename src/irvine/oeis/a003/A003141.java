package irvine.oeis.a003;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003141 Minimal number of arcs whose reversal yields a transitive tournament.
 * @author Sean A. Irvine
 */
public class A003141 implements Sequence {

  private static final class DigraphCheck extends DirectedGraph {
    private int mMax = 0; // maximum of the minimums for a graph
    private int mMin = 0;

    private void removeCycles(final Graph g, final int removedSoFar) {
      if (removedSoFar >= mMin) {
        // Already exceeded current minimum for this graph
        return;
      }
      if (!g.isCyclic()) {
        if (removedSoFar < mMin) {
          mMin = removedSoFar;
        }
        return;
      }
      // Sequentially try removing each edge in the graph
      for (int u = 0; u < g.order(); ++u) {
        int v = -1;
        while ((v = g.nextVertex(u, v)) >= 0) {
          g.removeEdge(u, v);
          removeCycles(g, removedSoFar + 1);
          if (mMin <= mMax) {
            // Early exit if this graph can be "solved" with less removals than current maximum
            return;
          }
          g.addEdge(u, v);
        }
      }
    }

    @Override
    protected void process(final Graph g) {
      //System.out.println(g);
      mMin = Integer.MAX_VALUE;
      removeCycles(g, 0);
      mMax = Math.max(mMax, mMin);
    }
  }

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Graph graph = GraphFactory.complete(mN);
    final DigraphCheck digraphChecker = new DigraphCheck();
    try {
      digraphChecker.direct(graph, 0, graph.order() - 1, Multigraph.NOLIMIT, true, graph.order());
    } catch (final IOException e) {
      throw new RuntimeException(e); // we are no making output
    }
    return Z.valueOf(digraphChecker.mMax);
  }

}

