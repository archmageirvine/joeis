package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013789 a(n) = 8^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013789 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(512) : mA.shiftLeft(12);
    return mA;
  }
}
