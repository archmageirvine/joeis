package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013742 a(n) = 8^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013742 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(9);
    return mA;
  }
}
