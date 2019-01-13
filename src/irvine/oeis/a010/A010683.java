package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010683.
 * @author Sean A. Irvine
 */
public class A010683 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
    } else {
      ++mN;
      final Z t = mB.multiply(6).multiply(Z.valueOf(mN).square().multiply2().subtract(1)).subtract(mA.multiply(mN - 2).multiply(2 * mN + 1))
        .divide(mN + 2).divide(2 * mN - 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
