package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026325.
 * @author Sean A. Irvine
 */
public class A026325 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.THREE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return mN == 2 ? Z.THREE : Z.ONE;
    }
    final Z t = mC.multiply(4 * mN + 15).subtract(mB.multiply(mN - 3)).subtract(mA.multiply(mN).multiply(6)).divide(mN + 6);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
