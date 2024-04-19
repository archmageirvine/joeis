package irvine.oeis.a043;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MultivariatePolynomialField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A043546 Coefficients of asymptotic expansion of return probability for random walk in d-dimensional cubic lattice as a function of d.
 * @author Sean A. Irvine
 */
public class A043546 extends Sequence0 {

  private static final MultivariatePolynomialField<Q> RING = new MultivariatePolynomialField<>(Rationals.SINGLETON, 2);
  private static final PolynomialRingField<Z> RINGZ = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  private MultivariatePolynomial<Q> i1(final int n) {
    final ArrayList<Q> coeff = new ArrayList<>();
    final int[][] terms = new int[n + 1][2];
    for (int k = 0; k <= n; ++k) {
      coeff.add(new Q(Z.ONE, Functions.FACTORIAL.z(k).square()));
      terms[k][0] = k;
    }
    return new MultivariatePolynomial<>(Rationals.SINGLETON, 2, terms, coeff);
  }

  private MultivariatePolynomial<Q> i2(final MultivariatePolynomial<Q> i1) {
    final MultivariatePolynomial<Q> res = new MultivariatePolynomial<>(Rationals.SINGLETON, 2);
    for (final Map.Entry<MultivariatePolynomial.Term, Q> e : i1.entrySet()) {
      final MultivariatePolynomial.Term t = e.getKey();
      res.put(new MultivariatePolynomial.Term(new int[] {t.get(0), 2 * t.get(0)}), e.getValue());
    }
    return res;
  }

  private MultivariatePolynomial<Q> shift1(final MultivariatePolynomial<Q> a) {
    final MultivariatePolynomial<Q> res = new MultivariatePolynomial<>(Rationals.SINGLETON, 2);
    for (final Map.Entry<MultivariatePolynomial.Term, Q> e : a.entrySet()) {
      final MultivariatePolynomial.Term t = e.getKey();
      res.put(new MultivariatePolynomial.Term(new int[] {t.get(0), t.get(1) - 1}), e.getValue());
    }
    return res;
  }

  private Polynomial<Z> g(final MultivariatePolynomial<Q> p, final int n) {
    final Z[] coeffs = new Z[n + 1];
    Arrays.fill(coeffs, Z.ZERO);
    for (final Map.Entry<MultivariatePolynomial.Term, Q> e : p.entrySet()) {
      final MultivariatePolynomial.Term t = e.getKey();
      final int k = t.get(0);
      final int w = t.get(1);
      if (w <= n) {
        coeffs[w] = coeffs[w].add(e.getValue().multiply(Functions.FACTORIAL.z(2 * k)).toZ());
      }
    }
    return Polynomial.create(coeffs);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final MultivariatePolynomial<Q> i1 = i1(mN);
    final MultivariatePolynomial<Q> i2 = i2(i1);
    // iw = i2^(1/(2y)) = exp(log(i2) / (2y))
    final int[] limits = {mN, mN + 1};
    final MultivariatePolynomial<Q> li2 = RING.log(i2, limits);
    final MultivariatePolynomial<Q> iw = RING.exp(shift1(RING.divide(li2, Q.TWO)), limits);
    //System.out.println("iw=" + iw);
    final Polynomial<Z> g = g(iw, mN);
    //System.out.println("g=" + g);
    return RINGZ.coeff(RINGZ.one(), g, mN).negate();
  }
}
