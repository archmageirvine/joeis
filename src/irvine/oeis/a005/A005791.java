package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005791 5-dimensional Catalan numbers.
 * @author Sean A. Irvine
 */
public class A005791 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(5 * mN - 4).multiply(5 * mN - 3).multiply(5 * mN - 2).multiply(5 * mN - 1).multiply(5)
        .divide(mN + 1).divide(mN + 2).divide(mN + 3).divide(mN + 4);
    }
    return mA;
  }
}
