package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061721 extends Sequence1 {

  // After Eric M. Schmidt

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      return Z.valueOf((mN - 1) / 2);
    }
    if ((mN & 3) == 2) {
      return Z.valueOf(mN - 2);
    }
    long numZeros = mN - 2;
    final long np = mN / 4;
    for (long m = 1; m < mN / 2; ++m) {
      final long t = LongUtils.lcm(m, np);
      if (((t / np) & 1) == 1) {
        final long maxmul = m * mN / 2;
        numZeros += maxmul / t - maxmul / (2 * t);
      }
    }
    return Z.valueOf(numZeros);
  }
}
