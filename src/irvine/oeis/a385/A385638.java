package irvine.oeis.a385;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386409 Number of nonnegative values s &lt; n such that (-s)^s = n - s (mod n).
 * @author Sean A. Irvine
 */
public class A385638 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k < mN; ++k) {
      if (LongUtils.modPow(mN - k, k, mN) == (mN - LongUtils.modPow(k, k, mN)) % mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

