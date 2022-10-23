package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003463 a(n) = (5^n - 1)/4.
 * @author Sean A. Irvine
 */
public class A003463 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    return mA.subtract(1).shiftRight(2);
  }
}
