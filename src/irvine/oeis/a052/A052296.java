package irvine.oeis.a052;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052296 Triangle read by rows: T(n,k) = number of labeled digraphs with n nodes and k arcs and without directed paths of length &gt;=2, with 0 &lt;= k &lt;= floor(n^2/4).
 * @author Sean A. Irvine
 */
public class A052296 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mRow = RING.one();
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      ++mN;
      mM = 0;
      mRow = RING.zero();
      for (int k = 0; k <= mN; ++k) {
        mRow = RING.add(mRow, RING.multiply(RING.pow(RING.subtract(RING.pow(RING.onePlusXToTheN(1), k), RING.one()), mN - k), Binomial.binomial(mN, k)));
      }
    }
    return mRow.coeff(mM);
  }
}
