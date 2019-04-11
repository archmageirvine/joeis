package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003010 A Lucas-Lehmer sequence: <code>a(0) = 4</code>; for <code>n&gt;0, a(n) = a(n-1)^2 - 2</code>.
 * @author Sean A. Irvine
 */
public class A003010 implements Sequence {

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

