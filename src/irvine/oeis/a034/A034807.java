package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034807 Triangle T(n,k) of coefficients of Lucas (or Cardan) polynomials.
 * @author Sean A. Irvine
 */
public class A034807 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  protected Z t(final Long n, final Long m) {
    if (m == 0) {
      return n == 0 ? Z.TWO : Z.ONE;
    }
    return Binomial.binomial(n - m - 1, m - 1).multiply(n).divide(m);
  }

  @Override
  public Z next() {
    if (2 * ++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
