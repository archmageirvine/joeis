package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A002701 Coefficients for numerical differentiation.
 * @author Sean A. Irvine
 */
public class A002701 extends A002455 {

  /** Construct the sequence. */
  public A002701() {
    super(2);
  }

  private int mN = -1;
  private Z mDen = Z.SIX;

  {
    super.next();
  }

  protected Q computeNext() {
    if (++mN > 0) {
      mDen = mDen.multiply(2 * mN + 3).multiply(2 * mN + 2).shiftLeft(2);
    }
    return new Q(super.next().multiply(6), mDen);
  }

  @Override
  public Z next() {
    return computeNext().num();
  }
}
