package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013824 a(n) = 2^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013824 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(5);
    return mA;
  }
}
