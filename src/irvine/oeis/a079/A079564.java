package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079564 Number of unlabeled connected simple graphs on n vertices with no induced subgraphs isomorphic to a P5 or complement of a P5 (P5 = path on 5 vertices.).
 * @author Sean A. Irvine
 */
public class A079564 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079564() {
    super(0, 0, 0, () -> graph -> GraphUtils.houseFree(graph) && GraphUtils.p5Free(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
