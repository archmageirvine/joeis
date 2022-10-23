package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013869 a(n) = 13^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013869 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(28561) : mA.multiply(371293);
    return mA;
  }
}
