package irvine.oeis.a058;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058071 A Fibonacci triangle: triangle T(n,k) = Fibonacci(k+1)*Fibonacci(n-k+1), for n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A058071 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int k) {
    return Fibonacci.fibonacci(k + 1).multiply(Fibonacci.fibonacci(n - k + 1));
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

