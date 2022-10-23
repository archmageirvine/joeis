package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013826 a(n) = 3^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013826 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(243);
    return mA;
  }
}
