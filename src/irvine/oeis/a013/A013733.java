package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013733 a(n) = 3^(3n+2).
 * @author Sean A. Irvine
 */
public class A013733 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(27);
    return mA;
  }
}
