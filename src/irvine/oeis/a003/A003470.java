package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003470 a(n) = n*a(n-1) - a(n-2) + 1 + (-1)^n.
 * @author Sean A. Irvine
 */
public class A003470 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(mN).subtract(mA).add((mN & 1) == 0 ? 2 : 0);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

