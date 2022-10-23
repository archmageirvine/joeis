package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027907 Triangle of trinomial coefficients T(n,k) (n &gt;= 0, 0 &lt;= k &lt;= 2*n), read by rows: n-th row is obtained by expanding (1 + x + x^2)^n.
 * @author Sean A. Irvine
 */
public class A027907 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1);
  private Polynomial<Z> mRow = RING.zero();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      mRow = RING.pow(C, ++mN);
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
