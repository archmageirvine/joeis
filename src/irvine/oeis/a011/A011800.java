package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011800 Number of labeled forests of n nodes each component of which is a path.
 * @author Sean A. Irvine
 */
public class A011800 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    } else if (mN > 2) {
      final Z t = mC.multiply(2 * mN - 1).multiply2()
        .subtract(mB.multiply(mN - 1).multiply(mN - 1).multiply2())
        .add(mA.multiply(mN - 1).multiply(mN - 2))
        .divide2();
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

