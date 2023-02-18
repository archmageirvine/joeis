package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061467 Remainder when the larger of n and its reverse is divided by the smaller.
 * @author Sean A. Irvine
 */
public class A061467 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final long r = LongUtils.reverse(mN);
    return Z.valueOf(r > mN ? r % mN : mN % r);
  }
}

