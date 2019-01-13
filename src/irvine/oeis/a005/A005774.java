package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005774.
 * @author Sean A. Irvine
 */
public class A005774 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN);
    }
    final Z t = mB.multiply(mN + 1).multiply(mN).multiply2().add(mA.multiply(mN - 1).multiply(mN).multiply(3)).divide(mN + 2).divide(mN - 1);
    mA = mB;
    mB = t;
    return mB;
  }
}
