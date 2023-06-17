package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001497 Triangle of coefficients of Bessel polynomials (exponents in decreasing order).
 * @author Sean A. Irvine
 */
public class A001497 extends AbstractSequence {

  /* Construct the sequence. */
  public A001497() {
    super(0);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
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
