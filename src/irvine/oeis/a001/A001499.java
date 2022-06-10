package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001499 Number of n X n matrices with exactly 2 1's in each row and column, other entries 0.
 * @author Sean A. Irvine
 */
public class A001499 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z t = mB.multiply(2 * mN - 3).add(mA.multiply(mN - 2).multiply(mN - 2))
        .multiply(mN).multiply(mN - 1).multiply(mN - 1).divide2();
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
