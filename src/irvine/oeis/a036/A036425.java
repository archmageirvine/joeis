package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A036425 Number of ternary rooted trees with n nodes and height exactly 10.
 * @author Sean A. Irvine
 */
public class A036425 extends A036370 {

  // This is very slow, because it essentially precomputes the entire sequence.
  // Once it starts generating is is fast ...

  private final Polynomial<Z> mNine;
  {
    for (int k = 1; k <= 9; ++k) {
      step();
    }
    mNine = mT;
    step();
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mT.degree()) {
      return null;
    }
    final Z t = mT.coeff(mN);
    final Z a = mNine.coeff(mN);
    return t.subtract(a);
  }
}
