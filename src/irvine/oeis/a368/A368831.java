package irvine.oeis.a368;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A368831 Irregular triangle read by rows: T(n,k) is the number of dominating subsets with cardinality k of the n X n rook graph (n &gt;= 0, 0 &lt;= k &lt;= n^2).
 * @author Gregory Morse
 */
public class A368831 extends Sequence0 {
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mK = 0;
  private Polynomial<Z> mRow;

  private static Polynomial<Z> nonzeroRows(final int n, final int m) {
    return RING.pow(RING.subtract(RING.pow(RING.onePlusXToTheN(1), m), RING.one()), n);
  }

  @Override
  public Z next() {
    if (++mK > mN * mN || mN < 0) {
      ++mN;
      mK = 0;
      mRow = nonzeroRows(mN, mN);
      for (int j = 0; j < mN; ++j) {
        final Polynomial<Z> t = RING.multiply(nonzeroRows(mN, j), Binomial.binomial(mN, j));
        mRow = ((mN - j) & 1) == 0 ? RING.subtract(mRow, t) : RING.add(mRow, t);
      }
    }
    return mRow.coeff(mK);
  }
}
