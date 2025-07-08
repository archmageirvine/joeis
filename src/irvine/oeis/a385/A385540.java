package irvine.oeis.a385;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385540 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A385540 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k < mN; ++k) {
      if (LongUtils.modPow(k, k, mN) == k % mN && LongUtils.modPow(mN - k, k, mN) == k % mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

