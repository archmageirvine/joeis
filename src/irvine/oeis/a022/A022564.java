package irvine.oeis.a022;

import irvine.math.graph.Graph;

/**
 * A022564 Number of 2-connected non-Hamiltonian claw-free graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A022564 extends A022563 {

  @Override
  protected long getCount(final Graph graph) {
    return super.getCount(graph) > 0 && !graph.isHamiltonian() ? 1 : 0;
  }
}
