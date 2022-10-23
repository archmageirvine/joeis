package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013784 a(n) = 6^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013784 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(1296);
    return mA;
  }
}
