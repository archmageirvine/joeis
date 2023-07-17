package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a001.A001824;

/**
 * A002554 Numerators of coefficients for numerical differentiation.
 * @author Sean A. Irvine
 */
public class A002554 extends A001824 {

  /** Construct the sequence. */
  public A002554() {
    super(1);
  }

  private Z mF = Z.ONE;
  private long mN = 0;

  protected Q step() {
    if (++mN > 1) {
      mF = mF.multiply(2 * mN).multiply(2 * mN - 1).shiftLeft(2).negate();
    }
    return new Q(super.next(), mF);
  }

  @Override
  public Z next() {
    return step().num();
  }
}
