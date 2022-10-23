package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013838 a(n) = 6^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013838 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(7776);
    return mA;
  }
}
