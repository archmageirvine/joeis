package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007272 Super ballot numbers: <code>60(2n)!/(n!(n+3)!)</code>.
 * @author Sean A. Irvine
 */
public class A007272 implements Sequence {

  private long mN = -1;
  private Z mA = Z.TEN;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN - 1).multiply2().divide(mN + 3);
    }
    return mA;
  }
}
