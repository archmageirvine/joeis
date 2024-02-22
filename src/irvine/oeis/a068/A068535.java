package irvine.oeis.a068;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068535 Numbers k such that 2^k mod k = 2^k mod k^2.
 * @author Sean A. Irvine
 */
public class A068535 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (LongUtils.modPow(2, mN, mN) == LongUtils.modPow(2, mN, mN * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

