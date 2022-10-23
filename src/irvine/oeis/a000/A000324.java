package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000324 A nonlinear recurrence: a(n) = a(n-1)^2 - 4*a(n-1) + 4 (for n&gt;1).
 * @author Sean A. Irvine
 */
public class A000324 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.FIVE;
    } else {
      mA = mA.square().subtract(mA.shiftLeft(2)).add(4);
    }
    return mA;
  }
}

