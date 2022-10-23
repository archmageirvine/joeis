package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025033 Increasing number of non-residues (number of non-residues).
 * @author Sean A. Irvine
 */
public class A025033 extends Sequence1 {

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
        return Z.valueOf(mMax);
      }
    }
  }
}
