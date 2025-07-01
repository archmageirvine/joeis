package irvine.oeis.a385;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385103 Number of values of s, 0 &lt; s &lt; n, such that -(s^s) == s (mod n).
 * @author Sean A. Irvine
 */
public class A385103 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k < mN; ++k) {
      if ((mN - LongUtils.modPow(k, k, mN)) % mN == k) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

