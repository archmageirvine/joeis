package irvine.oeis.a016;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016108.
 * @author Sean A. Irvine
 */
public class A016108 implements Sequence {

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
