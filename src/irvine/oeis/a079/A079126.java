package irvine.oeis.a079;

import java.util.ArrayList;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A079126 Triangle T(n,k) of numbers of partitions of n into distinct positive integers &lt;= k, 0&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A079126 extends AbstractSequence {

  /* Construct the sequence. */
  public A079126() {
    super(0);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final ArrayList<Polynomial<Z>> mCols = new ArrayList<>();
  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    while (m >= mCols.size()) {
      Polynomial<Z> prod = RING.one();
      for (int k = 1; k <= mCols.size(); ++k) {
        prod = RING.multiply(prod, RING.onePlusXToTheN(k));
      }
      mCols.add(prod);
    }
    return mCols.get(m).coeff(n);
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
