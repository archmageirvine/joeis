package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013788 a(n) = 8^(4*n + 1).
 * @author Sean A. Irvine
 */
public class A013788 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(12);
    return mA;
  }
}
