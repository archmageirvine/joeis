package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002457 <code>a(n) = (2n+1)!/n!^2</code>.
 * @author Sean A. Irvine
 */
public class A002457 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN + 1).multiply2().divide(mN);
    }
    return mA;
  }
}
