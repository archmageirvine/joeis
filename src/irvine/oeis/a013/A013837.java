package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013837 a(n) = 5^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013837 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(625) : mA.multiply(3125);
    return mA;
  }
}
