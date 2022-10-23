package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013756 a(n) = 15^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013756 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(15) : mA.multiply(3375);
    return mA;
  }
}
