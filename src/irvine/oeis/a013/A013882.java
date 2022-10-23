package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013882 a(n) = 17^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013882 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(17) : mA.multiply(1419857);
    return mA;
  }
}
