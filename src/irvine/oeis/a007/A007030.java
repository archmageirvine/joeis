package irvine.oeis.a007;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;

/**
 * A007030 Non-Hamiltonian simplicial polyhedra with n nodes.
 * @author Sean A. Irvine
 */
public class A007030 extends ParallelPlantriSequence {

  /** Construct the sequence. */
  public A007030() {
    super(0, 11);
  }

  @Override
  public boolean accept(final Plantri plantri, final PlantriGraphState state) {
    return !state.toGraph().isHamiltonian();
  }
}

