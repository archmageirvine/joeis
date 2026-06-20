package irvine.oeis.a085;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085471 Triangle of coefficients of numerators of powers of e^2 in Sum_{k&gt;=1} {1 / (1 + (k+1/2)^2*Pi^2)^n} + {4^n / (4+Pi^2)^n}.
 * @author Sean A. Irvine
 */
public class A085471 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private static final Polynomial<Q> X_PLUS_ONE = Polynomial.create(Q.ONE, Q.ONE);
  private static final Polynomial<Q> ONE_MINUS_X = Polynomial.create(Q.ONE, Q.NEG_ONE);

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mP = RING.zero();

  private static long key(final int m, final int r) {
    return (((long) m) << 32) ^ (r & 0xFFFFFFFFL);
  }

  private static int m(final long key) {
    return (int) (key >>> 32);
  }

  private static int r(final long key) {
    return (int) key;
  }

  private static void add(final HashMap<Long, Q> map, final int m, final int r, final Q v) {
    if (v.isZero()) {
      return;
    }
    final long k = key(m, r);
    final Q old = map.get(k);
    map.put(k, old == null ? v : old.add(v));
  }

  private void buildRow(final int n) {

    // T_1 / pi^2 = y^-1 u, where u = tanh(y)
    HashMap<Long, Q> state = new HashMap<>();
    add(state, 1, 1, Q.ONE);

    for (int k = 1; k < n; ++k) {
      final HashMap<Long, Q> next = new HashMap<>();
      final Q scale = new Q(2L * k);

      for (final Map.Entry<Long, Q> e : state.entrySet()) {
        final int m = m(e.getKey());
        final int r = r(e.getKey());
        final Q c = e.getValue();

        if (r > 0) {

          // tanh'(y) = 1 - u^2

          // -r/(2k) * y^-(m+1) * u^(r+1)
          add(next, m + 1, r + 1, c.multiply(-r).divide(scale));

          // +r/(2k) * y^-(m+1) * u^(r-1)
          add(next, m + 1, r - 1, c.multiply(r).divide(scale));
        }

        // +m/(2k) * y^-(m+2) * u^r
        add(next, m + 2, r, c.multiply(m).divide(scale));
      }

      state = next;
    }

    // Evaluate y = 1 giving A_n(u)
    Polynomial<Q> au = RING.zero();
    for (final Map.Entry<Long, Q> e : state.entrySet()) {
      au = RING.add(au, RING.monomial(e.getValue(), r(e.getKey())));
    }

    // u = (x - 1)/(x + 1)
    final int d = au.degree();

    Polynomial<Q> num = RING.zero();

    for (int r = 0; r <= d; ++r) {
      final Q c = au.coeff(r);
      if (!c.isZero()) {
        final Polynomial<Q> t =
          RING.multiply(
            RING.pow(ONE_MINUS_X, r),
            RING.pow(X_PLUS_ONE, d - r)
          );
        num = RING.add(num, RING.multiply(t, c));
      }
    }

    final Polynomial<Q> den = RING.pow(X_PLUS_ONE, d);

    // multiply by (n-1)! * 2^(n-1)
    final Q scale = new Q(Functions.FACTORIAL.z(n - 1).shiftLeft(n - 1));
    num = RING.multiply(num, scale);

    final Polynomial<Q> targetDen = RING.pow(X_PLUS_ONE, n);
    if (!den.equals(targetDen)) {
      throw new RuntimeException("Unexpected denominator for n=" + n);
    }

    mP = num;
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      buildRow(mN);
      mM = mP.degree();
    }
    return mP.coeff(mM).toZ().negate();
  }
}
