package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013712 a(n) = 7^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013712 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply(49);
    return mA;
  }
}
