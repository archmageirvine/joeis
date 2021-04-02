package irvine.oeis.a046;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A046082 Number of ultraconnected graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A046082 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A046082() {
    super(0, 0, false, false, false);
  }

  private int deficiency(final Graph graph) {
    return graph.order() * (graph.order() - 1) / 2 - graph.size();
  }

  private boolean isUltraconnected(final Graph s, final Graph sComplementInG, final int v) {
    if (v < 0) {
      return sComplementInG.numberOfComponents() <= deficiency(s) + 1;
    }
    if (!isUltraconnected(s.delete(v), sComplementInG, v - 1)) {
      return false;
    }
    return isUltraconnected(s, sComplementInG.delete(v), v - 1);
  }

  private boolean isUltraconnected(final Graph graph) {
    return isUltraconnected(graph, graph, graph.order() - 1);
  }

  @Override
  protected long getCount(final Graph graph) {
    return isUltraconnected(graph) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
