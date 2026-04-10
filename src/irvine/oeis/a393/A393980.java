package irvine.oeis.a393;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393980 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A393980 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final long w = LongUtils.floorLog2(mN);
    return Z.valueOf(((mN & 1) == 1 ? (1L << w) + mN : (5L << w) - mN - 2) / 2);
  }
}
