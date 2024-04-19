package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001498 Triangle a(n,k) (n &gt;= 0, 0 &lt;= k &lt;= n) of coefficients of Bessel polynomials y_n(x) (exponents in increasing order).
 * @author Sean A. Irvine
 */
public class A001498 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mK = 0;

  private Z t(final int n, final int m) {
    return Functions.FACTORIAL.z(n + m)
      .shiftRight(m)
      .divide(Functions.FACTORIAL.z(m))
      .divide(Functions.FACTORIAL.z(n - m));
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
