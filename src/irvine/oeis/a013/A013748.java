package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013748 a(n) = 11^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013748 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(11) : mA.multiply(1331);
    return mA;
  }
}
