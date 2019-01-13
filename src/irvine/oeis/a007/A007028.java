package irvine.oeis.a007;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;
import irvine.oeis.Sequence;

/**
 * A007028.
 * @author Sean A. Irvine
 */
public class A007028 extends ParallelPlantriSequence implements Sequence {

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

