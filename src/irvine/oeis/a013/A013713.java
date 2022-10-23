package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013713 a(n) = 8^(2n+1).
 * @author Sean A. Irvine
 */
public class A013713 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(6);
    return mA;
  }
}
