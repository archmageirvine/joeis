package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013797 a(n) = 12^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013797 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(1728) : mA.multiply(20736);
    return mA;
  }
}
