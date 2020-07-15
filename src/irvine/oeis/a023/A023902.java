package irvine.oeis.a023;

import java.util.Collections;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A023902 Theta series of <code>A_11</code> lattice.
 * @author Sean A. Irvine
 */
public class A023902 implements Sequence {

  // After Robert Harley

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING2 = new PolynomialRingField<>("q", RING);
  private int mN = -2;

  private Polynomial<Polynomial<Z>> theta3(final int k, final int n, final int prec) {
    final Polynomial<Z> f = Cyclotomic.cyclotomic(n);
    Polynomial<Polynomial<Z>> sum = RING2.one();
    for (int m = 1; m <= IntegerUtils.sqrt(prec); ++m) {
      final Polynomial<Z> x = RING.add(RING.monomial(Z.ONE, (m * k) % n), RING.monomial(Z.ONE, (m * (n - k)) % n));
      final Polynomial<Z> r = RING.mod(x, f);
      sum = RING2.add(sum, RING2.monomial(r, m * m));
    }
    return sum;
  }

  private Polynomial<Z> modEval(final Polynomial<Polynomial<Z>> s, final Polynomial<Z> m) {
    final Polynomial<Z> res = RING.create(Collections.emptyList());
    for (final Polynomial<Z> c : s) {
      res.add(RING.eval(RING.mod(c, m), Z.ONE));
    }
    return res;
  }

  private Polynomial<Z> aaa(final int n, final int prec) {
    Polynomial<Polynomial<Z>> sum = RING2.zero();
    for (int k = 0; k < n; ++k) {
      final Polynomial<Polynomial<Z>> t3 = theta3(k, n, prec);
      sum = RING2.add(sum, RING2.pow(t3, n, prec));
    }
    // At this point we can reduce sum to a single variate polynomial
    final Polynomial<Z> num = modEval(sum, Cyclotomic.cyclotomic(n));
    Polynomial<Z> den = RING.one();
    for (int m = 1; m <= IntegerUtils.sqrt(prec / n); ++m) {
      den = RING.add(den, RING.monomial(Z.TWO, n * m * m));
    }
    return RING.divide(RING.series(num, den, prec), Z.valueOf(n));
  }

  protected int dimension() {
    return 11;
  }

  @Override
  public Z next() {
    mN += 2;
    return aaa(dimension() + 1, mN).coeff(mN);
  }
}
