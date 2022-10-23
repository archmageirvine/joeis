package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013818 a(n) = 23^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013818 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(23) : mA.multiply(279841);
    return mA;
  }
}
