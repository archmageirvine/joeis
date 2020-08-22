package irvine.oeis.a158;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;
import java.util.HashMap;

/**
 * A158616 Table of expansion coefficients [x^m] of the Rayleigh polynomial of index 2n.
 * @author Sean A. Irvine
 */
public class A158616 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.ONE_QUARTER));
  private static final Polynomial<Q> B = RING.create(Arrays.asList(Q.ONE, Q.ONE));
  private int mN = 0;
  private Polynomial<Q> mP = RING.zero();
  private int mDeg = 1;

  private static final HashMap<String, Polynomial<Q>> SIG_CACHE = new HashMap<>();

  private static Polynomial<Q> makePoly(final int n) {
    return RING.create(Arrays.asList(new Q(n), Q.ONE));
  }

  private static Polynomial<Q> sig2n(final int n, final int m) {
    final String key = n + "_" + m;
    final Polynomial<Q> res = SIG_CACHE.get(key);
    if (res != null) {
      return res;
    }
    if (n == 1) {
      final Polynomial<Q> r = RING.series(A, B, m);
      SIG_CACHE.put(key, r);
      return r;
    }
    Polynomial<Q> sum = RING.zero();
    for (int k = 1; k < n; ++k) {
      sum = RING.add(sum, RING.multiply(sig2n(k, m), sig2n(n - k, m)));
    }
    final Polynomial<Q> rr = RING.series(sum, makePoly(n), m);
    SIG_CACHE.put(key, rr);
    return rr;
  }

  /**
   * Construct a Rayleigh polynomial expanded to given degree.
   * @param n index over 2
   * @param degree degree of polynomial to retain
   * @return polynomial
   */
  public static Polynomial<Q> phi2n(final int n, final int degree) {
    Polynomial<Q> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      prod = RING.multiply(prod, RING.pow(makePoly(k), n / k, degree), degree);
    }
    return RING.multiply(sig2n(n, degree), RING.multiply(prod, new Q(Z.ONE.shiftLeft(2 * n))), degree);
  }

  @Override
  public Z next() {
    if (mDeg > mP.degree()) {
      mP = phi2n(++mN, mN);
      mDeg = 0;
    }

    return mP.coeff(mDeg++).toZ();
  }
}

