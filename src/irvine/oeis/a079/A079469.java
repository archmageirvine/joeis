package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079469 Number of unlabeled and connected graphs on n vertices which are semi-P4-sparse (G is semi-P4-sparse iff G has no induced P5, House, or complement of a fork).
 * @author Sean A. Irvine
 */
public class A079469 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079469() {
    super(0, 0, 0, () -> graph -> GraphUtils.p5Free(graph) && GraphUtils.houseFree(graph) && GraphUtils.kiteFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
