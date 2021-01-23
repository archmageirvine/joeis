package irvine.oeis.a039;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039598 Triangle formed from odd-numbered columns of triangle of expansions of powers of x in terms of Chebyshev polynomials U_n(x). Sometimes called Catalan's triangle.
 * @author Sean A. Irvine
 */
public class A039598 implements Sequence {

  private Z j(final long n, final long m) {
    return Binomial.binomial(2 * n, n + m).multiply(m).divide(n);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return j(mN, mM);
  }
}

