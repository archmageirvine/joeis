package irvine.oeis.a022;

import irvine.math.graph.Graph;

/**
 * A022564 Number of 2-connected nonhamiltonian claw-free graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A022564 extends A022563 {

  @Override
  protected boolean accept(final Graph graph) {
    return super.accept(graph) && !graph.isHamiltonian();
  }
}
