package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013715 a(n) = 10^(2n+1).
 * @author Sean A. Irvine
 */
public class A013715 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.multiply(100);
    return mA;
  }
}
