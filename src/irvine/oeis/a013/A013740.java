package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013740 a(n) = 7^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013740 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply(343);
    return mA;
  }
}
