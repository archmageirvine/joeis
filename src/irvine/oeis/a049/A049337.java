package irvine.oeis.a049;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A0049337.
 * @author Sean A. Irvine
 */
public class A049337 implements Sequence {

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

