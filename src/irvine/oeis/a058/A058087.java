package irvine.oeis.a058;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A058087 Triangle read by rows, giving coefficients of the m\u00e9nage hit polynomials ordered by descending powers. T(n, k) for 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A058087 extends AbstractSequence {

  /* Construct the sequence. */
  public A058087() {
    super(0);
  }

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= k; ++j) {
      final Z t = Binomial.binomial(n - k + j, n - k).multiply(Binomial.binomial(n + k - j, n - k + j)).multiply(MemoryFactorial.SINGLETON.factorial(k - j)).multiply(2L * n).divide(n + k - j);
      sum = sum.signedAdd((j & 1) == 0, t);
    }
    return sum;
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
