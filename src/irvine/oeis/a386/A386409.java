package irvine.oeis.a386;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386409 Number of nonnegative values s &lt; n such that (-s)^s == -s (mod n).
 * @author Sean A. Irvine
 */
public class A386409 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k < mN; ++k) {
      if (LongUtils.modPow(mN - k, k, mN) == mN - k) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

