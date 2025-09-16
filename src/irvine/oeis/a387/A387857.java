package irvine.oeis.a387;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387683.
 * @author Sean A. Irvine
 */
public class A387857 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long s = 0; s < mN; ++s) {
      if ((LongUtils.modPow(s, s, mN) + LongUtils.modPow(mN - s, mN, mN)) % mN == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
