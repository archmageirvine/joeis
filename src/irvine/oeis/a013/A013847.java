package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013847 a(n) = 8^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013847 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(64) : mA.shiftLeft(15);
    return mA;
  }
}
