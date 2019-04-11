package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002054 Binomial coefficient C(2n+1, <code>n-1)</code>.
 * @author Sean A. Irvine
 */
public class A002054 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(mN).multiply(2 * mN + 1).multiply2().divide(mN - 1).divide(mN + 2);
    }
    return mA;
  }
}
