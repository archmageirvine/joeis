package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007564 Shifts left when INVERT transform applied thrice.
 * @author Sean A. Irvine
 */
public class A007564 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(2 * mN - 1).subtract(mA.multiply(mN - 2)).multiply(4).divide(mN + 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
