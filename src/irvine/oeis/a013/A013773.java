package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013773 a(n) = 23^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013773 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(529) : mA.multiply(12167);
    return mA;
  }
}
