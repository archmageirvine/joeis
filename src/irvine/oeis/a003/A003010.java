package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003010 A Lucas-Lehmer sequence: a(0) = 4; for n&gt;0, a(n) = a(n-1)^2 - 2.
 * @author Sean A. Irvine
 */
public class A003010 extends Sequence0 {

  private Z mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.FOUR;
    } else {
      mPrev = mPrev.square().subtract(2);
    }
    return mPrev;
  }
}

