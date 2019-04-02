package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002840 Number of polyhedral graphs with n edges.
 * @author Sean A. Irvine
 */
public class A002840 implements Sequence {

  private final ArrayList<Z> mEdgeCounts = new ArrayList<>();
  private int mN = 2; // Tracks number of vertices
  private final Plantri mPlantri = new Plantri();
  {
    for (int k = 0; k < Plantri.MAX_EDGES; ++k) {
      mEdgeCounts.add(Z.ZERO);
    }
    mEdgeCounts.set(6, Z.ONE);
  }

  private void step(final int n) {
    mPlantri.count(n, -1, -1, -1, false, true, false, false);
    final long[] edgeCounts = mPlantri.getEdgeCounts();
    for (int e = 0; e < edgeCounts.length; ++e) {
      mEdgeCounts.set(e, mEdgeCounts.get(e).add(edgeCounts[e]));
    }
  }

  @Override
  public Z next() {
    if (++mN > 3) {
      step(mN);
    }
    return mEdgeCounts.get(mN + 3);
  }
}

