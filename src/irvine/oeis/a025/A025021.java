package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025021 Numbers whose least quadratic nonresidue (A020649) is 3.
 * @author Sean A. Irvine
 */
public class A025021 extends Sequence1 {

  private long mN = 6;

  static boolean isResidue(final long n, final long m) {
    for (long k = 1; k <= m / 2; ++k) {
      if (LongUtils.modPow(k, 2, m) == n) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (isResidue(2, ++mN) && !isResidue(3, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
