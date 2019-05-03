package irvine.oeis.a007;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;

/**
 * A007031 <code>Non-Hamiltonian 1-tough</code> simplicial polyhedra with n nodes.
 * @author Sean A. Irvine
 */
public class A007031 extends ParallelPlantriSequence {

  /** Construct the sequence. */
  public A007031() {
    super(0, 12);
  }

  @Override
  public boolean accept(final Plantri plantri, final PlantriGraphState state) {
    final Graph g = state.toGraph();
    return !g.isHamiltonian() && GraphUtils.isOneTough(g);
  }
}

