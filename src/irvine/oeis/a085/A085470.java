package irvine.oeis.a085;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085470.
 * @author Sean A. Irvine
 */
public class A085470 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> XP1 = Polynomial.create(Q.ONE, Q.ONE);
  private static final Polynomial<Q> XM1 = Polynomial.create(Q.NEG_ONE, Q.ONE);
  private int mN = 0;
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
    // T_1 / pi^2 = y^-1 u
    HashMap<Long, Q> state = new HashMap<>();
    add(state, 1, 1, Q.ONE);

    for (int k = 1; k < n; ++k) {
      final HashMap<Long, Q> next = new HashMap<>();
      final Q scale = new Q(2L * k);
      for (final Map.Entry<Long, Q> e : state.entrySet()) {
        final int m = m(e.getKey());
        final int r = r(e.getKey());
        final Q c = e.getValue();

        // + r/(2k) y^-(m+1) u^(r+1)
        if (r > 0) {
          add(next, m + 1, r + 1, c.multiply(r).divide(scale));
          // - r/(2k) y^-(m+1) u^(r-1)
          add(next, m + 1, r - 1, c.multiply(-r).divide(scale));
        }

        // + m/(2k) y^-(m+2) u^r
        add(next, m + 2, r, c.multiply(m).divide(scale));
      }

      state = next;
    }

    // Evaluate y=1 giving A_n(u)
    Polynomial<Q> au = RING.zero();
    for (final Map.Entry<Long, Q> e : state.entrySet()) {
      au = RING.add(au, RING.monomial(e.getValue(), r(e.getKey())));
    }

    // u = (x+1)/(x-1)
    final int d = au.degree();
    Polynomial<Q> num = RING.zero();
    for (int r = 0; r <= d; ++r) {
      final Q c = au.coeff(r);
      if (!c.isZero()) {
        final Polynomial<Q> t = RING.multiply(RING.pow(XP1, r), RING.pow(XM1, d - r));
        num = RING.add(num, RING.multiply(t, c));
      }
    }

    final Polynomial<Q> den = RING.pow(XM1, d);
    // A_n - 1
    num = RING.subtract(num, den);
    // multiply by (n-1)! * 2^(n-1)
    final Q scale = new Q(Functions.FACTORIAL.z(n - 1).shiftLeft(n - 1));
    num = RING.multiply(num, scale);
    // denominator should be (x-1)^n
    final Polynomial<Q> targetDen = RING.pow(XM1, n);
    if (!den.equals(targetDen)) {
      throw new RuntimeException("Unexpected denominator for n=" + n);
    }
    mP = num;
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      buildRow(++mN);
      mM = mP.degree();
    }
    return mP.coeff(mM).toZ();
  }
}
