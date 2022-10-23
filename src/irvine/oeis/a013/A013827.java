package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013827 a(n) = 3^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013827 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(243);
    return mA;
  }
}
