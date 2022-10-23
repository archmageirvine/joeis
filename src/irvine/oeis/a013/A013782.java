package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013782 a(n) = 5^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013782 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.multiply(625);
    return mA;
  }
}
