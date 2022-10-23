package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013857 a(n) = 10^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013857 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(10000) : mA.multiply(100000);
    return mA;
  }
}
