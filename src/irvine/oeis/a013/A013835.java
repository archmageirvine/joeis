package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013835 a(n) = 5^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013835 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(25) : mA.multiply(3125);
    return mA;
  }
}
