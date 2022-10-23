package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013739 a(n) = 6^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013739 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(36) : mA.multiply(216);
    return mA;
  }
}
