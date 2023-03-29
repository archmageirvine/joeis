package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062383 a(0) = 1: for n&gt;0, a(n) = 2^floor(log_2(n)+1) or a(n) = 2*a(floor(n/2)).
 * @author Sean A. Irvine
 */
public class A062383 extends Sequence0 {

  private long mN = -1;
  private long mLim = 1;

  @Override
  public Z next() {
    if (++mN >= mLim) {
      mLim *= 2;
    }
    return Z.valueOf(mLim);
  }
}
