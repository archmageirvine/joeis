package irvine.oeis.a049;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049337 Triangle read by rows: T(n,k) is the number of 3-connected planar graphs (or polyhedra) with n &gt;= 1 nodes and 0 &lt;= k &lt;= C(n,2) edges.
 * @author Sean A. Irvine
 */
public class A049337 extends Sequence1 {

  private int mN = 0;
  private int mM = 1;
  private long[] mEdgeCounts;

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      if (++mN == 1) {
        return Z.ZERO;
      }
      final Plantri plantri = new Plantri();
      plantri.count(mN, -1, -1, -1, false, true, false, false);
      mEdgeCounts = plantri.getEdgeCounts();
      mM = 0;
    }
    return Z.valueOf(mEdgeCounts[mM + 3]);
  }
}

