package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065293 Number of values of s, 0 &lt;= s &lt;= n-1, such that 2^s mod n = s.
 * @author Sean A. Irvine
 */
public class A065293 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long s = 0; s < mN; ++s) {
      if (LongUtils.modPow(2, s, mN) == s) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
