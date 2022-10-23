package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013714 a(n) = 9^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013714 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(81);
    return mA;
  }
}
