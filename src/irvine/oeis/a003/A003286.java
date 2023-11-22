package irvine.oeis.a003;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A003286 Number of semi-regular digraphs (with loops) on n unlabeled nodes with each node having out-degree 2.
 * @author Sean A. Irvine
 */
public class A003286 extends Sequence2 implements GraphProcessor {

  // The paper in the OEIS entry describes a cycle index approach, but I could not discover all the detail.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private DigraphCheck mDigraph = null;
  private long mGenCount = 0;
  private int mN = 1;

  private static final class DigraphCheck extends DirectedGraph {
    private long mCount = 0;

    @Override
    protected void process(final Graph g) {
      // At this point have directed graph but without any loops.  The graph is guaranteed
      // to be non-isomorphic to any other at this stage and to have at most 2n edges.
      final int n = g.order();
      // Check graph is 2-out-degree regular or that it can be made so by adding loops
      for (int k = 0; k < n; ++k) {
        final long outDegree = g.degree(k);
        if (outDegree > 2 || outDegree < 1) {
          return; // Cannot be fixed by adding loops
        }
      }
      // The given graph is either already 2-out-degree regular or can be made so by
      // addition of loops at vertices of out degree 1 (there is no need to explicitly
      // add the loops).  We count this one as in the set.
      ++mCount;
    }
  }

  @Override
  public void process(final Graph graph) {
    ++mGenCount;
    // Given an undirected graph, convert the edges into a directed graph in all possible ways.
    // Since all the input graphs are non-isomorphic, the resulting graphs are also
    // non-isomorphic.
    mDigraph.direct(graph, 0, graph.size(), 2 * graph.order(), false, false);
  }

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    final GenerateGraphs gg = new GenerateGraphs(1);
    // The final graph must have directed 2n edges.  For this first part we are generating
    // simple graphs.  So if we allow every node to have a loop, this leaves n edges.
    // But each of these n can become two edges in the directed form, therefore, the least
    // possible edges in the undirected graph is n / 2.
    gg.setVertices(mN);
    gg.setMinEdges(mN / 2);
    gg.setMaxEdges(2 * mN);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mDigraph = new DigraphCheck();
    mGenCount = 0;
    gg.run(false, false, false, 0, 0);
    if (mVerbose) {
      System.out.println("Undirected generated count was " + mGenCount);
    }
    return Z.valueOf(mDigraph.mCount);
  }
}
