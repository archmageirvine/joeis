package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027390 Number of labeled servers of dimension 3.
 * @author Sean A. Irvine
 */
public class A027390 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z t = mC.multiply(3).add(mB.multiply(mN - 1).multiply(3)).add(mA.multiply(mN - 1).multiply(mN - 2));
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
