package irvine.oeis.a051;

import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A051175 Number of trees T of order n such that W(T) = W(L(L(T))) where W(G) and L(G) are the Wiener index and line graph of a graph G.
 * @author Sean A. Irvine
 */
public class A051175 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A051175() {
    super(0, 9, 0, () -> graph -> graph.wienerIndex() == graph.lineGraph().lineGraph().wienerIndex() ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    // generate trees
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setConnectionLevel(1);
  }
}
