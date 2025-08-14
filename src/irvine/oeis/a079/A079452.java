package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079452 Number of unlabeled and connected graphs on n vertices which are chordal and P5-free.
 * @author Sean A. Irvine
 */
public class A079452 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079452() {
    super(0, 0, 0, () -> graph -> GraphUtils.c4Free(graph) && GraphUtils.c5Free(graph) && GraphUtils.p5Free(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
