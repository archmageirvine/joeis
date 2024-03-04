package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001763 a(n) = (3n+3)!/(2n+3)!.
 * @author Sean A. Irvine
 */
public class A001763 extends AbstractSequence {

  /** Construct the sequence. */
  public A001763() {
    super(-1);
  }

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
