package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061649 Smallest absolute value of a remainder when the larger of n and its reverse is divided by the smaller.
 * @author Sean A. Irvine
 */
public class A061649 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final long r = LongUtils.reverse(mN);
    if (r > mN) {
      final long s = r % mN;
      return Z.valueOf(Math.min(s, mN - s));
    } else {
      final long s = mN % r;
      return Z.valueOf(Math.min(s, r - s));
    }
  }
}

