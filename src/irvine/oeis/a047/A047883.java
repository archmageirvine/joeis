package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047883 Squares on unbounded chessboard for which the least number of knight's moves from corner (0,0) is n.
 * @author Sean A. Irvine
 */
public class A047883 extends Sequence0 {

  private static final int[] SMALL = {0, 2, 9, 20, 27, 32};
  private int mN = 0;
  private Z mA = Z.valueOf(32);

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    mA = mA.add(7);
    return mA;
  }
}
