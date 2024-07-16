package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013708 a(n) = 3^(2*n+1).
 * @author Sean A. Irvine
 */
public class A013708 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(9);
    return mA;
  }
}
