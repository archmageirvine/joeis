package irvine.oeis.a065;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065931 Triangle of coefficients of Bessel polynomials {y_n(x)}'.
 * @author Sean A. Irvine
 */
public class A065931 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int k) {
    return MemoryFactorial.SINGLETON.factorial(n + k + 1)
      .divide(MemoryFactorial.SINGLETON.factorial(k))
      .divide(MemoryFactorial.SINGLETON.factorial(n - k - 1))
      .shiftRight(k + 1);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
