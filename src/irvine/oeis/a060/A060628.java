package irvine.oeis.a060;

import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A060628 Triangle of coefficients in expansion of elliptic function sn(u) in powers of u and k.
 * @author Sean A. Irvine
 */
public class A060628 implements Sequence {

  // Using approach described by Peter Bala

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>("k", Rationals.SINGLETON);
  private static final PolynomialRing<Polynomial<Q>> RING_OUT = new PolynomialRing<>(RING);
  private int mN = -1;
  private int mK = 0;
  private Polynomial<Q> mRow;

  // Based on impl in PolynomialRingField
  private Polynomial<Polynomial<Q>> sqrt1p(final Polynomial<Polynomial<Q>> p, final int n) {
    Polynomial<Polynomial<Q>> s = RING_OUT.one();
    if (!RING_OUT.zero().equals(p)) {
      Polynomial<Q> coeff = RING.one();
      Polynomial<Q> kEven = RING.zero();
      Polynomial<Q> kOdd = RING.one();
      for (int k = 1; k <= n; ++k) {
        coeff = RING.multiply(coeff, kOdd);
        kOdd = RING.add(kEven, RING.one());
        kEven = RING.add(kOdd, RING.one());
        coeff = RING.series(coeff, kEven, n);
        final Polynomial<Polynomial<Q>> t = RING_OUT.multiply(RING_OUT.pow(p, k, n), coeff);
        s = RING_OUT.signedAdd((k & 1) == 1, s, t);
      }
    }
    return s;
  }

  private Polynomial<Polynomial<Q>> f(final int n) {
    final Polynomial<Q> x2 = RING.create(Arrays.asList(Q.NEG_ONE, Q.ZERO, Q.NEG_ONE)); // -(k^2+1)
    final Polynomial<Polynomial<Q>> s = RING_OUT.create(Arrays.asList(RING.zero(), RING.zero(), x2, RING.zero(), RING.monomial(Q.ONE, 2)));
    return sqrt1p(s, n);
  }

  private Polynomial<Polynomial<Q>> d(final int m, final int n) {
    if (m == 0) {
      return RING_OUT.one();
    }
    final Polynomial<Polynomial<Q>> f = f(n);
    //System.out.println("f(x)=" + f);
    return RING_OUT.diff(RING_OUT.multiply(f, d(m - 1, n), n));
  }

  protected Polynomial<Q> row(final int n) {
    return RING_OUT.eval(d(2 * n, 2 * n), RING.zero());
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
      mRow = row(mN);
    }
    return mRow.coeff(2 * mK).toZ().abs();
  }
}
