package irvine.oeis.a050;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.RationalFunction;
import irvine.math.polynomial.RationalFunctionField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050203 a(n) is the coefficient of the term a^(-n) in the asymptotic series for the least positive zero of the generalized Rogers-Ramanujan continued fraction.
 * @author Sean A. Irvine
 */
public class A050203 extends Sequence1 {

  // After Kok Seng Chua

  private static final PolynomialRingField<Q> RING_Q = new PolynomialRingField<>("q", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING_X = new PolynomialRingField<>(RING_Q);
  private static final RationalFunctionField<Q> RAT = new RationalFunctionField<>(Rationals.SINGLETON);
  private final ArrayList<Z> mS = new ArrayList<>();
  {
    mS.add(null);
  }
  private int mN = 0;

  private Z rr(final int n) {
    Polynomial<Polynomial<Q>> w = RING_X.one();
    Polynomial<Polynomial<Q>> p = RING_X.one();
    Polynomial<Polynomial<Q>> po = RING_X.one();

    for (int k = 1; k <= n; ++k) {
      w = RING_X.subtract(p, RING_X.multiply(po, RING_X.monomial(RING_Q.monomial(Q.ONE, k), 1), n));
      po = p;
      p = w;
    }
    //System.out.println("w=" + w);

    final int m = w.degree();
    Polynomial<Polynomial<Q>> w1 = RING_X.zero();
    for (int k = 0; k <= m; ++k) {
      final Polynomial<Q> h = w.coeff(k);
      Polynomial<Q> h1 = RING_Q.zero();
      for (int j = 1; j <= n - 1 + k; ++j) {
        h1 = RING_Q.add(h1, RING_Q.monomial(h.coeff(j), j));
      }
      w1 = RING_X.add(w1, RING_X.monomial(h1, k));
    }
    //System.out.println("w1=" + w1);

    RationalFunction<Q> q = RAT.zero();
    for (int k = 1; k < n; ++k) {
      q = RAT.add(q, new RationalFunction<>(RING_Q.monomial(new Q(mS.get(k)), 0), RING_Q.monomial(Q.ONE, k)));
    }
    final int qdenDegree = q.right().degree();
    //System.out.println("q=" + q + " (den degree=" + qdenDegree + ")");

    // Substitute polynomial q into w1
    Q res = Q.ZERO;
    for (int k = 0; k <= w1.degree(); ++k) {
      final Polynomial<Q> w1k = w1.coeff(k);
      Polynomial<Q> zk = RING_Q.zero();
      for (int j = 0; j <= w1k.degree(); ++j) {
        final Q c = w1k.coeff(j);
        if (!c.equals(Q.ZERO)) {
          final int s = qdenDegree * w1k.degree() - qdenDegree * j;
          zk = RING_Q.add(zk, RING_Q.multiply(RING_Q.pow(q.left(), j), c).shift(s));
        }
      }

      final int shift = qdenDegree * w1k.degree() - qdenDegree - k;
      if (shift >= 0) {
        res = res.add(zk.coeff(shift));
      }
    }

    return res.toZ();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mS.add(Z.ONE);
    } else {
      mS.add(rr(mN));
    }
    return mS.get(mS.size() - 1);
  }
}
