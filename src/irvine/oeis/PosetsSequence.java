package irvine.oeis;

import java.util.function.Predicate;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.math.nauty.PosetGraph;
import irvine.math.z.Z;

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
    super(offset - 1, offset - 1, false, false, false);
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

  private static final class DigraphCheck extends PosetGraph {

    private final Predicate<Graph> mAccept;
    private long mCount = 0;

    private DigraphCheck(final Predicate<Graph> accept) {
      mAccept = accept;
    }

    private boolean dfs(final Graph g, final int v, final long neighbours) {
      if ((neighbours & (1L << v)) != 0) {
        return true;
      }
      for (int w = g.nextVertex(v, -1); w >= 0; w = g.nextVertex(v, w)) {
        if (dfs(g, w, neighbours)) {
          return true;
        }
      }
      return false;
    }

    private boolean isTransitiveReduced(final Graph g, final int u) {
      long neighbours = 0;
      for (int v = g.nextVertex(u, -1); v >= 0; v = g.nextVertex(u, v)) {
        neighbours |= 1L << v;
      }
      for (int v = g.nextVertex(u, -1); v >= 0; v = g.nextVertex(u, v)) {
        if (dfs(g, v, neighbours & ~(1L << v))) {
          return false;
        }
      }
      return true;
    }

    private boolean isPoset(final Graph g) {
      for (int u = 0; u < g.order(); ++u) {
        if (!isTransitiveReduced(g, u)) {
          return false;
        }
      }
      return true;
    }

    @Override
    protected void process(final Graph g) {
      //System.out.println(g.order() + " " + g + " " + isPoset(g));
      if (isPoset(g) && mAccept.test(g)) {
        ++mCount;
      }
    }
  }

  @Override
  protected long getCount(final Graph graph) {
    final DigraphCheck digraph = new DigraphCheck(mAccept);
    digraph.generate(graph, 0, 0, Multigraph.NOLIMIT);
    return digraph.mCount;
  }

  @Override
  public Z next() {
    return super.next();
  }
}
