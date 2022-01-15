package irvine.oeis.a053;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.IrreduciblePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053725 Number of n X n binary matrices of order dividing 3 (also number of solutions to X^3=I in GL(n,2)).
 * @author Sean A. Irvine
 */
public class A053725 implements Sequence {

  // After Andrew Howroyd

  private int mN = 0;
  private final int mK;

  protected A053725(final int k) {
    mK = k;
  }

  /** Construct the sequence. */
  public A053725() {
    this(3);
  }

  private Polynomial<Q> b(final int n, final int q, final int e) {
    final Z qz = Z.valueOf(q);
    final Q[] coeffs = new Q[n + 1];
    Arrays.fill(coeffs, Q.ZERO);
    for (int m = 0; m <= n / e; ++m) {
      Z prod = Z.ONE;
      for (int k = 0; k < m; ++k) {
        prod = prod.multiply(qz.pow(m * e).subtract(qz.pow(k * e)));
      }
      coeffs[m * e] = new Q(Z.ONE, prod);
    }
    return Polynomial.create(coeffs);
  }

  private List<Polynomial<Z>> factor(final PolynomialRingField<Z> ring, final Polynomial<Z> f) {
    final ArrayList<Polynomial<Z>> res = new ArrayList<>();
    Polynomial<Z> g = f;
    for (final Iterator<Polynomial<Z>> it = IrreduciblePolynomials.iterator(); !ring.one().equals(g);) {
      final Polynomial<Z> ir = it.next();
      while (IrreduciblePolynomials.exactlyDivides(g, ir)) {
        g = ring.divide(g, ir);
        res.add(ir);
      }
    }
    return res;
  }

  private Z f(final int n, final int q, final int k) {
    if (q != 2 || IntegerUtils.gcd(q, k) != 1) {
      throw new UnsupportedOperationException();
    }
    final PolynomialRingField<Z> ring = new PolynomialRingField<>(new GaloisField(q));
    final PolynomialRingField<Q> rat = new PolynomialRingField<>(Rationals.SINGLETON);
    Polynomial<Q> p = rat.one();
    for (final Polynomial<Z> f : factor(ring, ring.oneMinusXToTheN(k))) {
      p = rat.multiply(p, b(n, q, f.degree()));
    }
    final Polynomial<Q> r = b(n, q, 1);
    return p.coeff(n).divide(r.coeff(n)).toZ();
  }

  @Override
  public Z next() {
    return f(++mN, 2, mK);
  }
}
