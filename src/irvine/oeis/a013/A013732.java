package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013732 a(n) = 3^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013732 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(27);
    return mA;
  }
}
