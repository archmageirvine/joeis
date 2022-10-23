package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013834 a(n) = 5^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013834 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.multiply(3125);
    return mA;
  }
}
