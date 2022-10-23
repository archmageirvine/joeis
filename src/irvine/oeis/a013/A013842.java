package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013842 a(n) = 7^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013842 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply(16807);
    return mA;
  }
}
