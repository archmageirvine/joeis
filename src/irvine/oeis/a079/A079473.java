package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079473 Number of prime graphs on n vertices. (G is prime iff G has no module. Modules are also called homogeneous sets.).
 * @author Sean A. Irvine
 */
public class A079473 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079473() {
    super(0, 0, 0, () -> graph -> GraphUtils.isPrime(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
