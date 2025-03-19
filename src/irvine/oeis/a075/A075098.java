package irvine.oeis.a075;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A075098 Number of simple graphs g on n nodes with |Aut(g)| = 8.
 * @author Sean A. Irvine
 */
public class A075098 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A075098() {
    super(1, 0, 2, false, false, false, () -> graph -> Z.EIGHT.equals(GraphUtils.automorphismSize(graph)) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(0);
  }
}
