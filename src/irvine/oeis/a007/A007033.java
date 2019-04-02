package irvine.oeis.a007;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;

/**
 * A007033 Non-Hamiltonian polyhedra with n nodes.
 * @author Sean A. Irvine
 */
public class A007033 extends ParallelPlantriSequence {

  /** Construct the sequence. */
  public A007033() {
    super(0, 11);
  }

  @Override
  public boolean accept(final Plantri plantri, final PlantriGraphState state) {
    return !state.toGraph().isHamiltonian();
  }

  @Override
  protected long runPlantri(final Plantri plantri) {
    return plantri.count(mN, -1, -1, -1, false, true, false, false);
  }
}

