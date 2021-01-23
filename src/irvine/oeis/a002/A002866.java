package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002866 a(0) = 1; for n &gt; 0, a(n) = 2^(n-1)*n!.
 * @author Sean A. Irvine
 */
public class A002866 implements Sequence {

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
