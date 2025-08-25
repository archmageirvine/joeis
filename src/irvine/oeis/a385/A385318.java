package irvine.oeis.a385;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385318 Number of nonnegative s &lt; n such that s^s == (-s)^s (mod n).
 * @author Sean A. Irvine
 */
public class A385318 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 1; // s == 0 is always a solution
    for (long s = 1; s < mN; ++s) {
      if (LongUtils.modPow(s, s, mN) == LongUtils.modPow(mN - s, s, mN)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
