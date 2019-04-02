package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a001.A001818;

/**
 * A002553 Coefficients for numerical differentiation.
 * @author Sean A. Irvine
 */
public class A002553 extends A001818 {

  private Z mF = Z.ONE;
  private long mN = -1;

  protected Q step() {
    if (++mN > 0) {
      mF = mF.multiply(2 * mN).multiply(2 * mN + 1).shiftLeft(2);
    }
    return new Q(super.next(), mF);
  }

  @Override
  public Z next() {
    return step().den();
  }
}
