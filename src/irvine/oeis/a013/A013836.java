package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013836 a(n) = 5^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013836 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(125) : mA.multiply(3125);
    return mA;
  }
}
