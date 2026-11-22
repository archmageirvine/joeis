package irvine.oeis.a318;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A318602 Triangle read by rows: T(n,k) is the number of rooted hypertrees on n unlabeled nodes with k edges, (0 &lt;= k &lt; n).
 * @author Gregory Morse
 */
public class A318602 extends Sequence1 {
  // After Andrew Howroyd.
  private static final PolynomialRingField<Q> Y = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y);
  private final Polynomial<Polynomial<Q>> mRooted = RING.empty();
  private int mN = 0;
  private int mK = 0;

  /** Construct the sequence. */
  public A318602() {
    mRooted.add(Y.zero());
  }

  protected final Polynomial<Polynomial<Q>> rooted(final int n) {
    while (mRooted.degree() < n) {
      final int k = mRooted.degree();
      final Polynomial<Polynomial<Q>> sets = PolynomialUtils.eulerTransform(Y, mRooted);
      final Polynomial<Polynomial<Q>> blocks = RING.multiply(RING.subtract(sets, RING.one()), Y.x());
      mRooted.add(k == 0 ? Y.one() : PolynomialUtils.eulerTransform(Y, blocks).coeff(k));
    }
    return mRooted;
  }

  protected final Polynomial<Polynomial<Q>> forest(final int n) {
    return PolynomialUtils.eulerTransform(Y, rooted(n));
  }

  protected Polynomial<Q> row(final int n) {
    return rooted(n).coeff(n);
  }

  protected final Polynomial<Q> unrooted(final int n) {
    final Polynomial<Polynomial<Q>> trees = rooted(n);
    final Polynomial<Polynomial<Q>> sets = RING.subtract(forest(n), RING.one());
    final Polynomial<Polynomial<Q>> blocks = RING.multiply(RING.subtract(sets, trees), Y.x());
    final Polynomial<Polynomial<Q>> flags = RING.multiply(RING.multiply(sets, trees, n), Y.x());
    return RING.subtract(RING.add(trees, blocks), flags).coeff(n);
  }

  @Override
  public Z next() {
    if (++mK >= mN) {
      ++mN;
      mK = 0;
    }
    return row(mN).coeff(mK).toZ();
  }
}
