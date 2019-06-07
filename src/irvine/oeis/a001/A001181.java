package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001181 Number of Baxter permutations of length <code>n</code>.
 * @author Sean A. Irvine
 */
public class A001181 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN > 1) {
      final Z n = Z.valueOf(mN);
      final Z t = mB.multiply(n.square().add(n).multiply(7).subtract(2))
        .add(mA.multiply(8).multiply(mN - 1).multiply(mN - 2))
        .divide(mN + 2).divide(mN + 3);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
