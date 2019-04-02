package irvine.oeis.a007;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;
import irvine.oeis.Sequence;

/**
 * A007025 Number of polyhedral graphs with n nodes and minimal degree 4.
 * @author Sean A. Irvine
 */
public class A007025 extends ParallelPlantriSequence implements Sequence {

  /** Construct the sequence. */
  public A007025() {
    super(3, 6);
  }

  @Override
  protected long runPlantri(final Plantri plantri) {
    return plantri.count(mN, 4, -1, -1, false, true, false, false);
  }

  @Override
  protected boolean accept(final Plantri plantri, final PlantriGraphState state) {
    return true;
  }
}

