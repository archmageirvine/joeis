package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.polynomial.LaguerrePolynomials;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386677 Triangle of numerators for rational convergents to Taylor series of 1/Gamma(x+1) (not in lowest terms).
 * @author Sean A. Irvine
 */
public class A386677 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  private Q t(final int n, final int k) {
    final Q sum = Rationals.SINGLETON.sum(0, n, j -> LaguerrePolynomials.p(0, j, Q.ONE).multiply(Functions.STIRLING1.z(j, k).multiply(Z.NEG_ONE.pow(j))).divide(Functions.FACTORIAL.z(j)));
    return sum.multiply(Functions.FACTORIAL.z(n).square());
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(t(mN, mM));
  }
}
