package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013731 a(n) = 2^(3*n+2).
 * @author Sean A. Irvine
 */
public class A013731 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.shiftLeft(3);
    return mA;
  }
}
