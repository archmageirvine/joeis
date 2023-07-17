package irvine.oeis.a055;

import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A055277 Triangle T(n,k) of number of rooted trees with n nodes and k leaves, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A055277 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A055277(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A055277() {
    super(1);
  }

  protected static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRing<Polynomial<Q>> RING_X = new PolynomialRing<>(RING_Y);
  protected static final Polynomial<Polynomial<Q>> XY = RING_X.monomial(RING_Y.x(), 1);
  private static final Polynomial<Polynomial<Q>> XY_MINUS_X = RING_X.subtract(XY, RING_X.x());

  private Polynomial<Polynomial<Q>> mGF = XY;
  private int mDeg = 1;

  protected static Polynomial<Polynomial<Q>> doubleSubstitute(final Polynomial<Polynomial<Q>> f, final int m) {
    Polynomial<Polynomial<Q>> res = RING_X.zero();
    for (int k = 0; k <= f.degree(); ++k) {
      final Polynomial<Q> c = f.coeff(k);
      if (!c.equals(RING_Y.zero())) {
        final Polynomial<Q> t = c.substitutePower(m);
        res = RING_X.add(res, RING_X.monomial(t, k * m));
      }
    }
    return res;
  }

  protected static Polynomial<Q> constant(final Q x) {
    return RING_Y.monomial(x, 0);
  }

  private Polynomial<Polynomial<Q>> exp(final Polynomial<Polynomial<Q>> p, final int n) {
    Polynomial<Polynomial<Q>> s = RING_X.one();
    if (!RING_X.zero().equals(p)) {
      Q invf = Q.ONE;
      for (int k = 1; k <= n; ++k) {
        invf = invf.divide(k);
        s = RING_X.add(s, RING_X.multiply(RING_X.pow(p, k, n), constant(invf)));
      }
    }
    return s;
  }

  protected Polynomial<Polynomial<Q>> gf(final int n) {
    while (mDeg < n) {
      final int m = ++mDeg;
      Polynomial<Polynomial<Q>> res = RING_X.zero();
      for (int k = 1; k <= m + 10; ++k) {
        res = RING_X.add(res, RING_X.multiply(doubleSubstitute(mGF, k), constant(new Q(1, k))));
      }
      res = RING_X.multiply(RING_X.x(), exp(res, m));
      mGF = RING_X.add(XY_MINUS_X, res);
    }
    return mGF;
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return gf(mN).coeff(mN).coeff(mM).toZ();
  }

}
