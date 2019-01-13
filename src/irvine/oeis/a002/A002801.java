package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002801.
 * @author Sean A. Irvine
 */
public class A002801 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(2 * mN - 1).subtract(mA.multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
