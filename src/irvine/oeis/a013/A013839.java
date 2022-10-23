package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013839 a(n) = 6^(5n+2).
 * @author Sean A. Irvine
 */
public class A013839 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(36) : mA.multiply(7776);
    return mA;
  }
}
