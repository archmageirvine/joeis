package irvine.oeis.a026;

import java.util.ArrayList;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026836 Triangular array T read by rows: T(n,k) = number of partitions of n into distinct parts, the greatest being k, for k=1,2,...,n.
 * @author Sean A. Irvine
 */
public class A026836 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final ArrayList<Polynomial<Z>> mCols = new ArrayList<>();
  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    while (m >= mCols.size()) {
      Polynomial<Z> prod = RING.one();
      for (int k = 1; k < mCols.size(); ++k) {
        prod = RING.multiply(prod, RING.onePlusXToTheN(k));
      }
      mCols.add(prod.shift(mCols.size()));
    }
    return mCols.get(m).coeff(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
