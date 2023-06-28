package irvine.oeis.a007;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;
import irvine.oeis.ParallelPlantriSequence;

/**
 * A007083 Number of unlabeled trivalent 3-connected bipartite planar graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A007083 extends ParallelPlantriSequence {

  /** Construct the sequence. */
  public A007083() {
    super(3, 0);
  }

  @Override
  protected boolean accept(final Plantri plantri, final PlantriGraphState state) {
    return true;
  }

  @Override
  protected long runPlantri(final Plantri plantri) {
    plantri.setBipartite(true);
    return plantri.count(mN, -1, -1, -1, false, false, false, false);
  }
}

