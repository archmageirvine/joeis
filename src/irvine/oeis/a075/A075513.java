package irvine.oeis.a075;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075513 Triangle read by rows. T(n, m) are the coefficients of Sidi polynomials.
 * @author Sean A. Irvine
 */
public class A075513 extends Sequence1 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Z.NEG_ONE.pow(n - m).multiply(Binomial.binomial(n, m).multiply(Z.valueOf(m + 1).pow(n)));
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

