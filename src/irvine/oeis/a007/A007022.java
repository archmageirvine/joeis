package irvine.oeis.a007;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;

/**
 * A007022 Number of 4-regular polyhedra with n nodes.
 * @author Sean A. Irvine
 */
public class A007022 extends ParallelPlantriSequence {

  /** Construct the sequence. */
  public A007022() {
    super(1, 2, 7);
  }

  @Override
  protected boolean accept(final Plantri plantri, final PlantriGraphState state) {
    return true;
  }

  @Override
  protected long runPlantri(final Plantri plantri) {
    return plantri.count(mN, -1, 3, -1, false, false, true, false);
  }
}

