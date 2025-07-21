package irvine.oeis.a385;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385729 Number of nonnegative values s &lt; n such that (-s) == (-s)^s == s^s (mod n).
 * @author Sean A. Irvine
 */
public class A385729 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long s = 0; s < mN; ++s) {
      final long ns = mN - s;
      if (LongUtils.modPow(ns, s, mN) == ns % mN && LongUtils.modPow(s, s, mN) == ns % mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

