package irvine.oeis.a279;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A279683 Number of move operations required to sort all permutations of [n] by MTF sort.
 * @author Sean A. Irvine
 */
public class A279683 extends Sequence0 {

  private int mN = -1;
  private Z mF = Z.ONE;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mN > 2) {
        mF = mF.multiply(mN - 1);
      }
      mA = mA.multiply(mN).add(mF.multiply(Z.ONE.shiftLeft(mN - 1).subtract(1)));
    }
    return mA;
  }
}
