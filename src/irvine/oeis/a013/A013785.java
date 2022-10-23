package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013785 a(n) = 6^(4n+3).
 * @author Sean A. Irvine
 */
public class A013785 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(216) : mA.multiply(1296);
    return mA;
  }
}
