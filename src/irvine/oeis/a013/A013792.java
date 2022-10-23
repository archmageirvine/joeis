package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013792 a(n) = 10^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013792 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.multiply(10000);
    return mA;
  }
}
