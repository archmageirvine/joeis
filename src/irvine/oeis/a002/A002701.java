package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.q.Q;

/**
 * A002701.
 * @author Sean A. Irvine
 */
public class A002701 extends A002455 {

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
