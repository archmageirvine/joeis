package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A000151 Number of oriented rooted trees with n nodes. Also rooted trees with n nodes and 2-colored non-root nodes.
 * @author Sean A. Irvine
 */
public class A000151 extends MemorySequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  protected int mN = 0;

  {
    setOffset(1);
    add(null);
  }

  private static Q coeff(final int c, final Q[] coeff, final int power) {
    if (power == 1) {
      return coeff[c];
    }
    // Multiply out by lcm so make an integer version
    Z lcm = Z.ONE;
    for (final Q q : coeff) {
      lcm = lcm.lcm(q.den());
    }
    final ArrayList<Z> g = new ArrayList<>();
    for (final Q aCoeff : coeff) {
      g.add(aCoeff.multiply(lcm).toZ());
    }
    // Convert to polynomial and return powered coefficient
    final Polynomial<Z> p = RING.pow(RING.create(g), power, c);
    return new Q(p.coeff(c), lcm.pow(power));
  }

  @Override
  protected Z computeNext() {
    if (++mN == 1) {
      return Z.ONE;
    }
    // Compute coefficients of sum_{k\ge1} A(x^k)/k truncated at order mN-1
    final Q[] coeffs = new Q[mN];
    for (int k = 0; k < mN; ++k) {
      coeffs[k] = Q.ZERO;
    }
    for (int k = 1; k < mN; ++k) {
      final Z zk = Z.valueOf(k);
      final int lim = (mN + k - 1) / k;
      for (int j = 1; j < lim; ++j) {
        final int e = j * k;
        coeffs[e] = coeffs[e].add(new Q(get(j), zk));
      }
    }
    for (int k = 0; k < mN; ++k) {
      coeffs[k] = coeffs[k].multiply(2);
    }

    // Perform exp of coeffs, extracting coefficient of x^(mN-1)
    Z f = Z.ONE;
    Q t = Q.ZERO;
    for (int k = 1; k < mN; ++k) {
      f = f .multiply(k);
      final Q s = coeff(mN - 1, coeffs, k).divide(f);
      t = t.add(s);
    }
    assert t.isInteger();
    return t.toZ();
  }
}

