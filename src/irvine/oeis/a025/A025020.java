package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025020 Numbers whose least quadratic nonresidue (A020649) is 2.
 * @author Sean A. Irvine
 */
public class A025020 implements Sequence {

  private long mN = 2;

  private boolean is(final long n) {
    for (long m = 1; m < n; ++m) {
      if (LongUtils.modPow(m, 2, n) == 2) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
