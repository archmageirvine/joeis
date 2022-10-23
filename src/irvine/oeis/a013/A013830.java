package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013830 a(n) = 4^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013830 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.shiftLeft(10);
    return mA;
  }
}
