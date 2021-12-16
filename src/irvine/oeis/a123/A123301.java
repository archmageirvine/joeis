package irvine.oeis.a123;

import java.util.ArrayList;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A123301 Triangle read by rows: T(n,k) is the number of specially labeled bicolored nonseparable graphs with k points in one color class and n-k points in the other class. "Special" means there are separate labels 1,2,...,k and 1,2,...,n-k for the two color classes (n &gt;= 2, k = 1,...,n-1).
 * @author Sean A. Irvine
 */
public class A123301 implements Sequence {

  // After Andrew Howroyd

  private static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING_X = new PolynomialRingField<>(RING_Y);

  private int mN = 0;
  private int mM = 0;

  private Polynomial<Polynomial<Q>> g(final int n) {
    final Polynomial<Polynomial<Q>> res = RING_X.empty();
    Z fi = Z.ONE;
    for (int i = 0; i <= n; fi = fi.multiply(++i)) {
      final Polynomial<Q> qp = RING_Y.empty();
      Z fj = Z.ONE;
      for (int j = 0; j <= n; fj = fj.multiply(++j)) {
        qp.add(new Q(Z.ONE.shiftLeft(i * j), fi.multiply(fj)));
      }
      res.add(qp);
    }
    return res;
  }

  private Polynomial<Polynomial<Q>> diffInner(final Polynomial<Polynomial<Q>> p) {
    final Polynomial<Polynomial<Q>> diff = RING_X.empty();
    for (final Polynomial<Q> t : p) {
      diff.add(RING_Y.diff(t));
    }
    return diff;
  }

  private final MemoryFactorial mF = new MemoryFactorial();

  // This version of reversion supports non-unit [x^1] coefficient
  // See https://mathworld.wolfram.com/SeriesReversion.html Morse and Feshbach formula
  private Polynomial<Polynomial<Q>> reversion(final PolynomialRingField<Polynomial<Q>> ring, final Polynomial<Polynomial<Q>> a, final int degree) {
    final Polynomial<Q> c1 = a.coeff(1);
    final Polynomial<Q> inverseC1 = RING_Y.series(RING_Y.one(), c1, degree);
    final Polynomial<Polynomial<Q>> w = ring.empty();
    w.add(RING_Y.zero());
    w.add(inverseC1);
    final List<Polynomial<Q>> aa = new ArrayList<>();
    for (int k = 2; k <= degree; ++k) {
      aa.add(RING_Y.multiply(a.get(k), inverseC1, degree));
    }
    Polynomial<Q> invk = inverseC1;
    for (int k = 2; k <= degree; ++k) {
      invk = RING_Y.multiply(invk, inverseC1, degree);
      final IntegerPartition part = new IntegerPartition(k - 1);
      final int[] j = new int[k];
      int[] p;
      Polynomial<Q> term = RING_Y.zero();
      while ((p = part.next()) != null) {
        IntegerPartition.toCountForm(p, j);
        final int sum = (int) IntegerUtils.sum(j);
        Polynomial<Q> prod = RING_Y.one();
        for (int i = 1; i < j.length; ++i) {
          if (j[i] > 0) {
            prod = RING_Y.divide(RING_Y.multiply(prod, RING_Y.pow(aa.get(i - 1), j[i], degree), degree), new Q(mF.factorial(j[i])));
          }
        }
        Z pr = Z.ONE;
        for (int u = k; u < k + sum; ++u) {
          pr = pr.multiply(u);
        }
        prod = RING_Y.multiply(prod, new Q(pr));
        term = RING_Y.signedAdd((sum & 1) == 0, term, prod);
      }
      w.add(RING_Y.divide(RING_Y.multiply(term, invk, degree), new Q(k)));
    }
    return w;
  }

  private Polynomial<Polynomial<Q>> swapVariables(final Polynomial<Polynomial<Q>> p) {
    // x <--> y
    final int n = p.degree();
    final Polynomial<Polynomial<Q>> res = RING_X.empty();
    for (int k = 0; k <= n; ++k) {
      final Q[] coeff = new Q[n + 1];
      for (int j = 0; j <= n; ++j) {
        coeff[j] = p.coeff(j).coeff(k);
      }
      res.add(Polynomial.create(coeff));
    }
    return res;
  }

  private Polynomial<Polynomial<Q>> log(final PolynomialRingField<Polynomial<Q>> ring, final Polynomial<Polynomial<Q>> g, final int n) {
    //final Polynomial<Polynomial<Q>> p = ring.log(g, n); // This gets it wrong!, so ...
    final Polynomial<Q> g0 = g.coeff(0);
    final Polynomial<Q> g1 = RING_Y.series(RING_Y.one(), g0, n);
    return ring.add(ring.log(ring.multiply(g, g1), n), ring.monomial(RING_Y.log(g0, n), 0));
  }

  private Polynomial<Polynomial<Q>> b(final int n) {
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, n));
    final Polynomial<Polynomial<Q>> g = g(n);
    final Polynomial<Polynomial<Q>> p = log(ring, g, n);
    final Polynomial<Polynomial<Q>> pdy = diffInner(p);
    final Polynomial<Polynomial<Q>> xpdx = ring.diff(p).shift(1);
    final Polynomial<Polynomial<Q>> spdx = reversion(ring, xpdx, n);
    final Polynomial<Polynomial<Q>> swap = swapVariables(ring.substitute(pdy, spdx, n));
    final Polynomial<Polynomial<Q>> log = log(ring, ring.series(ring.x(), reversion(ring, swap.shift(1), n), n), n);
    return ring.integrate(log);
  }

  private Polynomial<Polynomial<Q>> mB = b(3);

  protected Z get(final int n, final int m) {
    if (mB.degree() <= n) {
      mB = b(n);
    }
    return mB.coeff(n).coeff(m).multiply(mF.factorial(n)).multiply(mF.factorial(m)).toZ();

  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN - mM + 1, mM);
  }
}
