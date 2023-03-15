package irvine.oeis.a061;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061928 Array T(n,m) = 1/beta(n+1,m+1) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A061928 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return MemoryFactorial.SINGLETON.factorial(n + m + 1)
      .divide(MemoryFactorial.SINGLETON.factorial(n))
      .divide(MemoryFactorial.SINGLETON.factorial(m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN - mM + 1);
  }
}

