package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013822 a(n) = 2^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013822 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.shiftLeft(5);
    return mA;
  }
}
