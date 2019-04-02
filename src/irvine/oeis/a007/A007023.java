package irvine.oeis.a007;

import irvine.math.graph.GraphUtils;
import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphProcessor;
import irvine.math.plantri.PlantriGraphState;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007023 Number of 4-connected polyhedra with n nodes.
 * @author Sean A. Irvine
 */
public class A007023 implements Sequence, PlantriGraphProcessor {

  private int mN = 5;
  private final Plantri mPlantri = new Plantri();
  {
    mPlantri.setGraphProcessor(this);
  }

  @Override
  public boolean accept(final Plantri plantri, final PlantriGraphState state) {
    for (int k = 0; k < mN; ++k) {
      if (state.degree(k) != 4) {
        return false;
      }
    }
    return GraphUtils.isKConnected(state.toGraph(), 4);
  }

  @Override
  public Z next() {
    if (++mN < 8) {
      return mN == 6 ? Z.ONE : Z.ZERO;
    }
    return Z.valueOf(mPlantri.count(mN, 4, 3, -1, false, true, false, true));
  }

}

