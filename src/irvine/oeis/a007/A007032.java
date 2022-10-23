package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphProcessor;
import irvine.math.plantri.PlantriGraphState;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007032 Number of non-Hamiltonian polyhedra with n faces.
 * @author Sean A. Irvine
 */
public class A007032 extends Sequence1 implements PlantriGraphProcessor {

  // In theory this will work, but very slow, even for a(10)

  private int mN = 2; // Tracks number of vertices
  private int mF = 0; // Tracks number of faces
  private final Plantri mPlantri = new Plantri();
  private final ArrayList<Z> mFaceCount = new ArrayList<>();
  {
    mPlantri.setGraphProcessor(this);
    // Way more terms than we can every compute using this method
    for (int k = 0; k < 100; ++k) {
      mFaceCount.add(Z.ZERO);
    }
  }

  @Override
  public boolean accept(final Plantri plantri, final PlantriGraphState state) {
    return !state.toGraph().isHamiltonian();
  }

  @Override
  public Z next() {
    ++mF;
    while (mN < 2 * (mF - 2)) {
      if (++mN >= 11) {
        mPlantri.count(mN, -1, -1, -1, false, true, false, false);
        final long[] edgeCounts = mPlantri.getEdgeCounts();
        for (int e = 0; e < edgeCounts.length; ++e) {
          if (edgeCounts[e] != 0) {
            final int f = e + 2 - mN;
            mFaceCount.set(f, mFaceCount.get(f).add(edgeCounts[e]));
          }
        }
      }
    }
    return mFaceCount.get(mF);
  }
}

