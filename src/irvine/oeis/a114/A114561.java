package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A114561 a(0) = 0; thereafter a(n+1) = 4^a(n).
 * @author Sean A. Irvine
 */
public class A114561 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : Z.TWO.pow(mA.multiply2().longValueExact());
    return mA;
  }
}
