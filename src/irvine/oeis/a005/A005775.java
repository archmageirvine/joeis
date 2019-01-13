package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005775.
 * @author Sean A. Irvine
 */
public class A005775 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = 2;

  @Override
  public Z next() {
    if (++mN > 3) {
      final Z t = mB.multiply(mN - 1).multiply(mN).multiply2().add(mA.multiply(mN - 1).multiply(mN - 2).multiply(3)).divide(mN + 2).divide(mN - 3);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

