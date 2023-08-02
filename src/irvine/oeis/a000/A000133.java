package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000133 Number of Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000133 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft(1L << mN)
      .add(Z.ONE.shiftLeft(1 + (1L << (mN - 1))).multiply((1L << mN) - 1))
      .shiftRight(mN + 1);
  }
}
