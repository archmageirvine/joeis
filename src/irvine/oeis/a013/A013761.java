package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013761 a(n) = 17^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013761 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(289) : mA.multiply(4913);
    return mA;
  }
}
