package irvine.oeis.a007;

import irvine.math.graph.GraphUtils;
import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphProcessor;
import irvine.math.plantri.PlantriGraphState;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007027 Number of 4-connected polyhedral graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007027 implements Sequence, PlantriGraphProcessor {

  private int mN = 3;
  private final Plantri mPlantri = new Plantri();
  {
    mPlantri.setGraphProcessor(this);
  }

  @Override
  public boolean accept(final Plantri plantri, final PlantriGraphState state) {
    return GraphUtils.isKConnected(state.toGraph(), 4);
  }

  @Override
  public Z next() {
    if (++mN < 6) {
      return mN == 4 ? Z.ONE : Z.ZERO;
    }
    return Z.valueOf(mPlantri.count(mN, 4, 3, -1, false, true, false, false));
  }
}

