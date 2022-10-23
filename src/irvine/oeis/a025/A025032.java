package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025032 Numbers with an increasing number of non-residues (moduli).
 * @author Sean A. Irvine
 */
public class A025032 extends Sequence1 {

  private long mN = 0;
  private long mMax = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long c = 0;
      for (long m = 2; m < mN; ++m) {
        if (!A025021.isResidue(m, mN)) {
          ++c;
        }
      }
      if (c > mMax) {
        mMax = c;
        return Z.valueOf(mN);
      }
    }
  }
}
