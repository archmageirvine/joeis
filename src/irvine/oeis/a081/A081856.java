package irvine.oeis.a081;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081856 Numbers k such that 2k-1 divides 2^k-1.
 * @author Sean A. Irvine
 */
public class A081856 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.modPow(2, ++mN, 2 * mN - 1) == 1 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

