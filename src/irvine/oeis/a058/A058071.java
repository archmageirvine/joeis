package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058071 A Fibonacci triangle: triangle T(n,k) = Fibonacci(k+1)*Fibonacci(n-k+1), for n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A058071 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int k) {
    return Functions.FIBONACCI.z(k + 1).multiply(Functions.FIBONACCI.z(n - k + 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

