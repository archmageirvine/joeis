package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013904 a(n) = 22^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013904 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(10648) : mA.multiply(5153632);
    return mA;
  }
}
