package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007029 Number of bipartite polyhedral graphs with n faces.
 * @author Sean A. Irvine
 */
public class A007029 implements Sequence {

  private final ArrayList<Z> mFaceCount = new ArrayList<>();
  private int mN = 7; // Tracks number of vertices
  private int mF = 5; // Tracks number of faces
  private final Plantri mPlantri = new Plantri();
  {
    mPlantri.setBipartite(true);
    // Way more terms than we can every compute using this method
    for (int k = 0; k < 100; ++k) {
      mFaceCount.add(Z.ZERO);
    }
  }

  @Override
  public Z next() {
    ++mF;
    while (mN < 2 * (mF - 2)) {
      mPlantri.count(++mN, -1, -1, -1, false, true, false, false);
      final long[] edgeCounts = mPlantri.getEdgeCounts();
      for (int e = 0; e < edgeCounts.length; ++e) {
        if (edgeCounts[e] != 0) {
          final int f = e + 2 - mN;
          mFaceCount.set(f, mFaceCount.get(f).add(edgeCounts[e]));
        }
      }
    }
    return mFaceCount.get(mF);
  }

}

