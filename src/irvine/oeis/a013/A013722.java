package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013722 a(n) = 17^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013722 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(17) : mA.multiply(289);
    return mA;
  }
}
