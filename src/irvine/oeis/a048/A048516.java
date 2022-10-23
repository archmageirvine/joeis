package irvine.oeis.a048;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048516 Array T read by diagonals: T(m,n)=number of subsets S of {1,2,3,...,m+n-1} such that |S|&gt;1 and |a-b|&gt;=m for all distinct a and b in S, m=1,2,3,...; n=1,2,3,...
 * @author Sean A. Irvine
 */
public class A048516 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(1, -2, 1);
  private int mN = -1;
  private int mM = 0;

  private Z t(final int m, final int n) {
    if (n == 0) {
      return Z.ZERO;
    }
    final long[] coeffs = new long[n + 1];
    coeffs[0] = 1;
    coeffs[1] = -1;
    coeffs[n] -= 1;
    return RING.coeff(RING.one(), RING.multiply(C1, Polynomial.create(coeffs), m), m);
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return t(mM, mN - mM);
  }
}
