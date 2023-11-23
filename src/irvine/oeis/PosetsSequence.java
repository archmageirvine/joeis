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

    @Override
    protected void process(final Graph poset) {
      if (mAccept.test(poset)) {
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
