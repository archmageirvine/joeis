package irvine.oeis.a007;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;

/**
 * A007028 Number of bipartite polyhedral graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007028 extends ParallelPlantriSequence {

  /** Construct the sequence. */
  public A007028() {
    super(7, 0);
  }

  @Override
  protected long runPlantri(final Plantri plantri) {
    plantri.setBipartite(true);
    return plantri.count(mN, -1, -1, -1, false, true, false, false);
  }

  @Override
  protected boolean accept(final Plantri plantri, final PlantriGraphState state) {
    return true;
  }
}

