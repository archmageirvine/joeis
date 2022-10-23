package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013747 a(n) = 10^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013747 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(100) : mA.multiply(1000);
    return mA;
  }
}
