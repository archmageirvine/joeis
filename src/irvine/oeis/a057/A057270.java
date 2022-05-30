package irvine.oeis.a057;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057270 Triangle T(n,k) of number of unilaterally connected digraphs on n unlabeled nodes with k arcs, k=0..n*(n-1).
 * @author Sean A. Irvine
 */
public class A057270 implements Sequence, GraphProcessor {

  // There are hints in Robinson's work that this sequence could be doable by the cycle index method.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM;
  private DigraphCheck mDigraph = null;
  private long mGenCount = 0;
  private long[] mCounts = {};

  private final class DigraphCheck extends DirectedGraph {

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
      ++mCounts[g.size()];
    }
  }

  @Override
  public void process(final Graph graph) {
    ++mGenCount;
    mDigraph.direct(graph, 0, graph.order() - 1, Multigraph.NOLIMIT, false);
  }


  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mCounts = new long[mN * (mN - 1) + 1];
      mM = 0;
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
      gg.run(false, false, false, 0, 0);
      if (mVerbose) {
        System.out.println("Undirected generated count was " + mGenCount);
      }
    }
    return Z.valueOf(mCounts[mM]);
  }
}
