package irvine.oeis.a241;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A241461 Number of simple connected graphs g on n nodes with |Aut(g)| = 16.
 * @author Sean A. Irvine
 */
public class A241461 extends ParallelGenerateGraphsSequence {

  private static final Z Z16 = Z.valueOf(16);

  /** Construct the sequence. */
  public A241461() {
    super(0, 6, 0, () -> graph -> GraphUtils.automorphismSize(graph).equals(Z16) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
