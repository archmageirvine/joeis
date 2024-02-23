package irvine.oeis.a068;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068563 Numbers n such that 2^n == 4^n (mod n).
 * @author Sean A. Irvine
 */
public class A068563 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (LongUtils.modPow(2, mN, mN) == LongUtils.modPow(4, mN, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
