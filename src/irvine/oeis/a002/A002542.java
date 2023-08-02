package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002542 Number of two-valued complete Post functions of n variables.
 * @author Sean A. Irvine
 */
public class A002542 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 32) {
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft((1L << mN) - 2).subtract(Z.ONE.shiftLeft((1L << (mN - 1)) - 1));
  }
}
