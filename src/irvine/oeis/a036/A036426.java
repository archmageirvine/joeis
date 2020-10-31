package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A036426 Number of ternary rooted trees with n nodes and height exactly 11.
 * @author Sean A. Irvine
 */
public class A036426 extends A036370 {

  // This is very slow, because it essentially precomputes the entire sequence.
  // Once it starts generating is is fast ...

  private final Polynomial<Z> mTen;
  {
    for (int k = 1; k <= 10; ++k) {
      step();
    }
    mTen = mT;
    step();
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mT.degree()) {
      return null;
    }
    final Z t = mT.coeff(mN);
    final Z a = mTen.coeff(mN);
    return t.subtract(a);
  }
}
