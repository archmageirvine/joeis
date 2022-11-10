package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003096 a(n) = a(n-1)^2 - 1, a(0) = 2.
 * @author Sean A. Irvine
 */
public class A003096 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.square().subtract(1);
    return mA;
  }
}
