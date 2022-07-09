package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A036635 Number of 5-ary rooted trees with n nodes and height exactly 4.
 * @author Sean A. Irvine
 */
public class A036635 extends A036606 {

  /** Construct the sequence. */
  public A036635() {
    super(5, 0);
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
