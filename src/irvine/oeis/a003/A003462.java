package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003462 a(n) = (3^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A003462 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return mA.subtract(1).divide2();
  }
}
