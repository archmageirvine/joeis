package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013840 a(n) = 6^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013840 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(216) : mA.multiply(7776);
    return mA;
  }
}
