package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013728 a(n) = 23^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013728 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(23) : mA.multiply(529);
    return mA;
  }
}
