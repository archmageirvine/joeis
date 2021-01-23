package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000289 A nonlinear recurrence: a(n) = a(n-1)^2 - 3*a(n-1) + 3 (for n&gt;1).
 * @author Sean A. Irvine
 */
public class A000289 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.FOUR;
    } else {
      mA = mA.square().subtract(mA.multiply(3)).add(3);
    }
    return mA;
  }
}
