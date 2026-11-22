package irvine.oeis.a290;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A290818 Array read by antidiagonals: T(m,n) = number of irredundant sets in the lattice (rook) graph K_m X K_n.
 * @author Gregory Morse
 */
public class A290818 extends Sequence1 {
  // After Andrew Howroyd.
  protected static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mK = 0;

  protected final Polynomial<Z> dominating(final int m, final int n) {
    final int k = Math.min(m, n);
    final int l = Math.max(m, n);
    final Polynomial<Z> a = RING.monomial(Z.valueOf(m).pow(n), n);
    final Polynomial<Z> b = RING.monomial(Z.valueOf(n).pow(m), m);
    final Z onto = Functions.FACTORIAL.z(k).multiply(Functions.STIRLING2.z(l, k));
    return RING.subtract(RING.add(a, b), RING.monomial(onto, l));
  }

  protected final Polynomial<Z> irredundant(final int m, final int n) {
    Polynomial<Z> sum = dominating(m, n);
    for (int k = 0; k < m; ++k) {
      for (int r = 2 * k; r < n; ++r) {
        final Z ways = Binomial.binomial(m, k).multiply(Binomial.binomial(n, r))
          .multiply(Functions.FACTORIAL.z(k)).multiply(Stirling.associatedSecondKind(2, r, k));
        if (!ways.isZero()) {
          final int h = n - r;
          final Z fac = Functions.FACTORIAL.z(h);
          for (int j = 0; j < m - k; ++j) {
            final Z count = Z.valueOf(h).pow(j).subtract(fac.multiply(Functions.STIRLING2.z(j, h)));
            sum = RING.add(sum, RING.monomial(ways.multiply(Binomial.binomial(m - k, j)).multiply(count), r + j));
          }
        }
      }
    }
    return sum;
  }

  protected Z term(final int m, final int n) {
    return RING.eval(irredundant(m, n), Z.ONE);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return term(mK, mN + 1 - mK);
  }
}
