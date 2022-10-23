package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013825 a(n) = 2^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013825 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(5);
    return mA;
  }
}
