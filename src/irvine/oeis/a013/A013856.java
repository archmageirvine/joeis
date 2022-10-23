package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013856 a(n) = 10^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013856 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(1000) : mA.multiply(100000);
    return mA;
  }
}
