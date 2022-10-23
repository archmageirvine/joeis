package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013832 a(n) = 4^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013832 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(64) : mA.shiftLeft(10);
    return mA;
  }
}
