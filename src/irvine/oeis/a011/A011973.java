package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011973 Triangle of numbers {binomial(n-k, k), n &gt;= 0, 0 &lt;= k &lt;= floor(n/2)}; or, triangle of coefficients of (one version of) Fibonacci polynomials.
 * @author Sean A. Irvine
 */
public class A011973 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN - mM, mM);
  }
}
