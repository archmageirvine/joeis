package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013778 a(n) = 3^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013778 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(81);
    return mA;
  }
}
