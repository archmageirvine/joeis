package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013735 a(n) = 4^(3*n+2).
 * @author Sean A. Irvine
 */
public class A013735 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(6);
    return mA;
  }
}
