package irvine.oeis.a007;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;

/**
 * A007036 Number of 1-supertough but <code>non-1-Hamiltonian</code> simplicial polyhedra with n nodes.
 * @author Sean A. Irvine
 */
public class A007036 extends ParallelPlantriSequence {

  /** Construct the sequence. */
  public A007036() {
    super(0, 10);
  }

  @Override
  public boolean accept(final Plantri plantri, final PlantriGraphState state) {
    final Graph g = state.toGraph();
    if (GraphUtils.isKHamiltonian(g, 1)) {
      return false;
    }
    for (int u = 0; u < g.order(); ++u) {
      if (!GraphUtils.isOneTough(g.delete(u))) {
        return false;
      }
    }
    return true; // g is 1-supertough
  }
}

