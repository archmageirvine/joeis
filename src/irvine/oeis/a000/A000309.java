package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000309 Number of rooted planar bridgeless cubic maps with 2n nodes.
 * @author Sean A. Irvine
 */
public class A000309 extends Sequence0 {

  private Z mPrev = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mPrev = mPrev.shiftLeft(2)
        .multiply(Binomial.binomial(3 * mN, 3))
        .divide(Binomial.binomial(2 * mN + 2, 3));
    }
    return mPrev;
  }
}

