package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079468 Number of unlabeled and connected graphs on n vertices which have no induced subgraph isomorphic to the 'fork' (fork = 4 vertices forming a path with a fifth vertex adjacent only to one of the non-end vertices).
 * @author Sean A. Irvine
 */
public class A079468 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079468() {
    super(0, 0, 0, () -> graph -> GraphUtils.forkFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
