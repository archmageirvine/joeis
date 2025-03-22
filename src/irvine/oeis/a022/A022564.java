package irvine.oeis.a022;

import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A022564 Number of 2-connected non-Hamiltonian claw-free graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A022564 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A022564() {
    super(0, 2, false, false, false, false, () -> graph -> A022562.isClawFree(graph) && !graph.isHamiltonian() ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(2);
  }
}
