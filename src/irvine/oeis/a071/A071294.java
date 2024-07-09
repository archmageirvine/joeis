package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071294 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    final Z n = Z.valueOf(mN);
    long cnt = 0;
    for (long b = 1; b < mN; ++b) {
      if (ZUtils.sprpTest(b, n)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
