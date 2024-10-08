package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013709 a(n) = 4^(2*n+1).
 * @author Sean A. Irvine
 */
public class A013709 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.shiftLeft(4);
    return mA;
  }
}
