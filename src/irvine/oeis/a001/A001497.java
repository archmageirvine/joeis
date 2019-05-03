package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A001497 Triangle of coefficients of Bessel polynomials (exponents in decreasing <code>order)</code>.
 * @author Sean A. Irvine
 */
public class A001497 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mK = 0;

  protected Z t(final int n, final int m) {
    return mF.factorial(2 * n - m)
      .shiftRight(n - m)
      .divide(mF.factorial(m))
      .divide(mF.factorial(n - m));
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return t(mN, mK);
  }
}
