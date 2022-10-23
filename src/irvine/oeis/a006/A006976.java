package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006976 Coefficients of Chebyshev T polynomials: a(n) = A053120(n+12, n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A006976 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 5, 5).multiply(mN + 12).shiftLeft(mN).divide(12);
  }
}
