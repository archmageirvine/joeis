package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013848 a(n) = 8^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013848 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(512) : mA.shiftLeft(15);
    return mA;
  }
}
