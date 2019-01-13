package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007024.
 * @author Sean A. Irvine
 */
public class A007024 implements Sequence {

  private final ArrayList<Z> mFaceCount = new ArrayList<>();
  private int mN = 1;
  private final Plantri mPlantri = new Plantri();

  @Override
  public Z next() {
    if (++mN < 6) {
      return Z.ZERO;
    }
    mPlantri.count(mN, 4, -1, -1, false, true, false, false);
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

