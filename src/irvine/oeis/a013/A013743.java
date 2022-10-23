package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013743 a(n) = 8^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013743 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(64) : mA.shiftLeft(9);
    return mA;
  }
}
