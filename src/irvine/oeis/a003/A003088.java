package irvine.oeis.a003;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.io.IOException;

/**
 * A003088.
 * @author Sean A. Irvine
 */
public class A003088 implements Sequence, GraphProcessor {

  // There are hints in Robinson's work that this sequence could be doable by the cycle index method.

  private static final class DigraphCheck extends DirectedGraph {
    private long mCount = 0;

    private void markAll(final Graph g, final boolean[] reachable, final int current) {
      if (reachable[current]) {
        return;
      }
      reachable[current] = true;
      int j = -1;
      while ((j = g.nextVertex(current, j)) >= 0) {
        markAll(g, reachable, j);
      }
    }

    @Override
    protected void process(final Graph g) {
      //System.out.println(g);
      // This reachability test is not as low-level as it could be, but we do make checks as we go
      final boolean[][] reachable = new boolean[g.order()][g.order()];
      for (int k = 0; k < g.order(); ++k) {
        markAll(g, reachable[k], k);
        for (int j = 0; j < k; ++j) {
          if (!reachable[k][j] && !reachable[j][k]) {
            return;
          }
        }
      }
      ++mCount;
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private DigraphCheck mDigraph = null;
  private long mGenCount = 0;

  @Override
  public void process(final Graph graph) throws IOException {
    ++mGenCount;
    mDigraph.direct(graph, 0, graph.order() - 1, Multigraph.NOLIMIT, false, graph.order());
  }


  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1); // They must obviously be connected
    gg.setMaxDeg(mN);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mDigraph = new DigraphCheck();
    mGenCount = 0;
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    if (mVerbose) {
      System.out.println("Undirected generated count was " + mGenCount);
    }
    return Z.valueOf(mDigraph.mCount);
  }
}
