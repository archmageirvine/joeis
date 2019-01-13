package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002426.
 * @author Sean A. Irvine
 */
public class A002426 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(2 * mN - 1).add(mA.multiply(3).multiply(mN - 1)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
