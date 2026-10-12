package irvine.oeis.a086;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A086842 Number of n-node prime P5-free chordal graphs which are not split.
 * @author Sean A. Irvine
 */
public class A086842 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A086842() {
    super(0, 6, 0, () -> graph -> GraphUtils.p5Free(graph) && GraphUtils.isPrime(graph) && graph.isChordal() && !GraphUtils.isSplit(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
