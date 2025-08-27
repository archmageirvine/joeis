package irvine.oeis.a385;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386409.
 * @author Sean A. Irvine
 */
public class A385429 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k < mN; ++k) {
      if ((2 * LongUtils.modPow(k, k, mN)) % mN == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

