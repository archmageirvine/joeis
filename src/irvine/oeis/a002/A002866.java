package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002866 a(0) = 1; for n &gt; 0, a(n) = 2^(n-1)*n!.
 * @author Sean A. Irvine
 */
public class A002866 extends Sequence0 {

  private Z mPrev = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mPrev = mPrev.multiply(2 * mN);
    }
    return mPrev;
  }
}
