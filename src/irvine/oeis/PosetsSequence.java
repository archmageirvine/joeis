package irvine.oeis;

import java.util.function.Predicate;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;

/**
 * Generate posets potentially in parallel.
 * @author Sean A. Irvine
 */
public class PosetsSequence extends ParallelGenerateGraphsSequence {

  private final Predicate<Graph> mAccept;

  /**
   * Construct a new poset generator.
   * @param offset offset of the sequence
   * @param accept thread-safe predicate indicating if the given graph should be accepted
   */
  public PosetsSequence(final int offset, final Predicate<Graph> accept) {
    super(offset, offset - 1, false, false, false);
    mAccept = accept;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN - 1);
    gg.setConnectionLevel(0);
    gg.sanitizeParams();
  }

  private static final class DigraphCheck extends DirectedGraph {

    private final Predicate<Graph> mAccept;
    private long mCount = 0;

    private DigraphCheck(final Predicate<Graph> accept) {
      mAccept = accept;
    }

    private boolean isPoset(final Graph g) {
      for (int u = 0; u < g.order(); ++u) {
        for (int v = g.nextVertex(u, -1); v >= 0; v = g.nextVertex(u, v)) {
          for (int w = g.nextVertex(v, -1); w >= 0; w = g.nextVertex(v, w)) {
            if (g.isAdjacent(u, w)) {
              return false;
            }
          }
        }
      }
      return true;
    }

    @Override
    protected void process(final Graph g) {
      System.out.println(g + " " + isPoset(g));
      if (isPoset(g) && mAccept.test(g)) {
        ++mCount;
      }
    }
  }

  @Override
  protected long getCount(final Graph graph) {
    final DigraphCheck digraph = new DigraphCheck(mAccept);
    digraph.direct(graph, 0, 0, Multigraph.NOLIMIT, true, true);
    return digraph.mCount;
  }

}
