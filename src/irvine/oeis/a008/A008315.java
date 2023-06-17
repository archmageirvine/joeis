package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008315 Catalan triangle read by rows. Also triangle of expansions of powers of x in terms of Chebyshev polynomials U_n(x).
 * @author Sean A. Irvine
 */
public class A008315 extends AbstractSequence {

  /* Construct the sequence. */
  public A008315() {
    super(0);
  }

  private long mN = -1;
  private long mM = 1;

  protected Z t(final long n, final long m) {
    return Binomial.binomial(n, m).subtract(Binomial.binomial(n, m - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
