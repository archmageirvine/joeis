package irvine.oeis.a016;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016108 Numbers k=3*m+1 such that 2^m == 1 (mod k).
 * @author Sean A. Irvine
 */
public class A016108 extends Sequence1 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (mN < 0) {
      mN = 1;
      return Z.ONE;
    }
    while (true) {
      mN += 3;
      if (LongUtils.modPow(2, ++mM, mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
