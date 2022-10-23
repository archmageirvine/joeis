package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013808 a(n) = 18^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013808 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(18) : mA.multiply(104976);
    return mA;
  }
}
