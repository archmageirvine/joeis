package irvine.oeis.a007;

import irvine.math.graph.GraphUtils;
import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;

/**
 * A007035.
 * @author Sean A. Irvine
 */
public class A007035 extends ParallelPlantriSequence {

  /** Construct the sequence. */
  public A007035() {
    super(0, 8);
  }

  @Override
  public boolean accept(final Plantri plantri, final PlantriGraphState state) {
    return !GraphUtils.isKHamiltonian(state.toGraph(), 1);
  }
}

