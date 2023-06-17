package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.graph.GraphUtils;
import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphProcessor;
import irvine.math.plantri.PlantriGraphState;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007026 Number of 4-connected polyhedral graphs with n faces.
 * @author Sean A. Irvine
 */
public class A007026 implements Sequence, PlantriGraphProcessor {

  private final ArrayList<Z> mFaceCount = new ArrayList<>();
  private int mN = 1;
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
      return mN == 2 ? Z.ONE : Z.ZERO;
    }
    mPlantri.count(mN, 4, 3, -1, false, true, false, false);
    final long[] edgeCounts = mPlantri.getEdgeCounts();
    while (mFaceCount.size() <= edgeCounts.length) {
      mFaceCount.add(Z.ZERO);
    }
    for (int k = mN * 2, j = mN; k < edgeCounts.length; ++k, ++j) {
      mFaceCount.set(j, mFaceCount.get(j).add(edgeCounts[k]));
    }
    return mFaceCount.get(mN);
  }

}

