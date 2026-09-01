package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A395158 Number of labeled K_4-free graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A395158 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A395158() {
    super(0, 0, GenerateGraphs.K4_FREE, () -> g -> Functions.FACTORIAL.z(g.order()).divide(GraphUtils.automorphismSize(g)).longValueExact());
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(0);
  }
}
