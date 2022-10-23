package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013751 a(n) = 12^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013751 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(144) : mA.multiply(1728);
    return mA;
  }
}
