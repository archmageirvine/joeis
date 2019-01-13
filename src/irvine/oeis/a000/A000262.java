package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000262.
 * @author Sean A. Irvine
 */
public class A000262 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final Z t = mB.multiply(2 * mN - 1).subtract(mA.multiply(mN - 1).multiply(mN - 2));
    mA = mB;
    mB = t;
    return t;
  }
}
