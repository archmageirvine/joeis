package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005222.
 * @author Sean A. Irvine
 */
public class A005222 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Q FOUR = new Q(4);

  private static final Polynomial<Q> S = RING.create(Arrays.asList(Q.ZERO, new Q(-4), FOUR, Q.ZERO, new Q(-4)));
  private static final Polynomial<Q> T = RING.create(Arrays.asList(Q.ONE, Q.ZERO, new Q(-4), Q.ZERO, new Q(-2)));
  private static final Polynomial<Q> M = RING.create(Arrays.asList(Q.ONE, Q.TWO));

  protected int mN = -1;

  // This is an ugly form of the sqrt expansion to deal with the non-unity leading coefficient
  static Polynomial<Q> sqrt(Polynomial<Q> p, final int n) {
    Q d = Q.TWO; // sqrt(4)
    Polynomial<Q> s = RING.monomial(d, 0);
    p = RING.subtract(p, RING.monomial(p.coeff(0), 0));
    if (!RING.zero().equals(p)) {
      Q coeff = Q.ONE;
      Q kEven = Q.ZERO;
      Q kOdd = Q.ONE;
      for (int k = 1; k <= n; ++k) {
        coeff = coeff.multiply(kOdd);
        kOdd = kEven.add(1);
        kEven = kOdd.add(1);
        coeff = coeff.divide(kEven);
        final Polynomial<Q> t = RING.multiply(RING.pow(p, k, n), coeff.divide(d));
        d = d.multiply(4);
        s = RING.signedAdd((k & 1) == 1, s, t);
      }
    }
    return s;
  }

  protected Polynomial<Q> a() {
    final int order = mN + 2;
    final Polynomial<Q> s = RING.sqrt1p(S, order);
    final Polynomial<Q> w = RING.multiply(RING.add(T, RING.multiply(M, s, order)), Q.TWO);
    final Polynomial<Q> u = sqrt(w, order);
    final Polynomial<Q> v = RING.subtract(RING.add(M, s), u);
    return RING.series(v, RING.monomial(FOUR, 2), order);
  }

  @Override
  public Z next() {
    ++mN;
    final int order = mN + 2;
    final Polynomial<Q> a = a();
    final Polynomial<Q> g = RING.add(a, RING.series(RING.pow(a, 3, order).shift(4), RING.pow(RING.subtract(RING.one(), a.shift(1)), 2, order), order));
    return g.coeff(mN).toZ();
  }
}
