package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A036631 Number of 4-ary rooted trees with n nodes and height exactly 7.
 * @author Sean A. Irvine
 */
public class A036631 extends A036606 {

  protected A036631(final int ary, final int height) {
    super(ary, height);
  }

  /** Construct the sequence. */
  public A036631() {
    this(4, 7);
  }

  private Polynomial<Q> mB;

  @Override
  protected void init() {
    if (mA == null) {
      super.init();
      mB = mA;
      step();
    }
  }

  @Override
  public Z next() {
    init();
    return mM > mA.degree() ? null : mA.coeff(mM).subtract(mB.coeff(mM++)).toZ();
  }
}
