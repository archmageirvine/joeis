package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002762 Number of bipartite partitions.
 * @author Sean A. Irvine
 */
public class A002762 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002762(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002762() {
    super(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  private static final PolynomialRing<Polynomial<Z>> RING_OUT = new PolynomialRing<>(RING);
  private final int mM = m();
  private final int mK = k();
  private int mN = -1;

  protected int m() {
    return 6;
  }

  protected int k() {
    return 2;
  }

  private Polynomial<Polynomial<Z>> series(final Polynomial<Polynomial<Z>> num, final Polynomial<Polynomial<Z>> den, final int order, final int m) {
    final Polynomial<Z> d = den.coeff(0);
    final ArrayList<Polynomial<Z>> a = new ArrayList<>();
    for (int k = 0; k <= order; ++k) {
      Polynomial<Z> s = num.coeff(k);
      for (int j = 0; j < k; ++j) {
        s = RING.subtract(s, RING.multiply(a.get(j), den.coeff(k - j)));
      }
      a.add(RING.series(s, d, m));
    }
    return RING_OUT.create(a);
  }

  // product(product(1-x^r * y^t),t=k..m), r=0..n) * product(1-x^s, s=1..n)
  // remember where we are up to (in terms of n) to avoid excessive recomputation
  private Polynomial<Polynomial<Z>> mCurrent = RING_OUT.one();
  private int mCurrentIndex = -1;

  private Polynomial<Polynomial<Z>> den(final int n) {
    while (mCurrentIndex < n) {
      ++mCurrentIndex;
      // left product
      for (int t = mK; t <= mM; ++t) {
        final Polynomial<Z> yt = RING.monomial(Z.ONE, t);
        mCurrent = RING_OUT.multiply(mCurrent, RING_OUT.oneMinusXToTheN(yt, mCurrentIndex));
      }
      // right product
      if (mCurrentIndex > 0) {
        mCurrent = RING_OUT.multiply(mCurrent, RING_OUT.oneMinusXToTheN(mCurrentIndex));
      }
    }
    return mCurrent;
  }

  private Polynomial<Polynomial<Z>> b(final int n) {
    final Polynomial<Polynomial<Z>> den = den(n);
    return series(RING_OUT.one(), den, n, mM);
  }

  private Z coeff(final int n) {
    return b(n).coeff(n).coeff(mM);
  }

  @Override
  public Z next() {
    return coeff(++mN);
  }
}
