package irvine.oeis.a007;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;
import irvine.oeis.Sequence;

/**
 * A007022.
 * @author Sean A. Irvine
 */
public class A007022 extends ParallelPlantriSequence implements Sequence {

  /** Construct the sequence. */
  public A007022() {
    super(2, 7);
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

