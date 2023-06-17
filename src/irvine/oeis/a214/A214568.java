package irvine.oeis.a214;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A214568 Triangle read by rows: T(n,k) is the number of rooted trees t with n vertices yielding k distinct rooted trees with n+1 vertices when a pendant edge is added to a vertex of t (1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A214568 extends AbstractSequence {

  /** Construct the sequence. */
  public A214568() {
    super(1);
  }

  private static final PolynomialRingField<Z> INNER_RING = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Z>> RING = new PolynomialRingField<>(INNER_RING);
  private static final Polynomial<Polynomial<Z>> XY = RING.monomial(INNER_RING.monomial(Z.ONE, 1), 1);
  protected Polynomial<Polynomial<Z>> mT = RING.monomial(INNER_RING.x(), 1);
  private int mN = 0;
  private int mK = 0;
  private int mRow = 1;

  protected Z t(final int p, final int k) {
    while (p > mRow) {
      stepT();
    }
    return mT.coeff(p).coeff(k);
  }

  private void stepT() {
    ++mRow;
    Polynomial<Polynomial<Z>> product = RING.one();
    for (int p = 1; p < mRow; ++p) {
      for (int k = 1; k <= p; ++k) {
        final Polynomial<Polynomial<Z>> num = RING.monomial(INNER_RING.monomial(Z.ONE, k), p);
        final Polynomial<Polynomial<Z>> den = RING.oneMinusXToTheN(p);
        final Polynomial<Polynomial<Z>> series = RING.add(RING.one(), RING.series(num, den, mRow));
        final Polynomial<Polynomial<Z>> t = RING.powz(series, t(p, k), mRow);
        product = RING.multiply(product, t, mRow);
      }
    }
    mT = RING.multiply(product, XY, mRow);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      mK = 1;
      ++mN;
    }
    return t(mN, mK);
  }
}
