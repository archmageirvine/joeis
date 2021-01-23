package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001763 Number of dissections of a ball: (3n+3)!/(2n+3)!.
 * @author Sean A. Irvine
 */
public class A001763 implements Sequence {

  private long mN = -2;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(3 * mN + 2).multiply(3 * mN + 1).multiply(3)
        .divide2().divide(2 * mN + 3);
    }
    return mA;
  }
}
