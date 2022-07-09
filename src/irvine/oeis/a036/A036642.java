package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A036642 Number of 6-ary rooted trees with n nodes and height exactly 4.
 * @author Sean A. Irvine
 */
public class A036642 extends A036606 {

  /** Construct the sequence. */
  public A036642() {
    super(6, 0);
  }

  private final Polynomial<Q> mB;
  {
    for (int k = 0; k <= 3; ++k) {
      step();
    }
    mB = mA;
    step();
  }

  @Override
  public Z next() {
    return mM >= mA.degree() ? null : mA.coeff(mM).subtract(mB.coeff(mM++)).toZ();
  }
}
