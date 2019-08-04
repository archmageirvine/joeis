package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025021 Least <code>non-residue mod n</code> is 3.
 * @author Sean A. Irvine
 */
public class A025021 implements Sequence {

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
