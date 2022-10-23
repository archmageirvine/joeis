package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013819 a(n) = 23^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013819 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(12167) : mA.multiply(279841);
    return mA;
  }
}
