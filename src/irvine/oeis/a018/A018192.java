package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a081.A081054;

/**
 * A018192 Number of chord diagrams of degree n with an isolated chord.
 * @author Sean A. Irvine
 */
public class A018192 extends A081054 {

  /** Construct the sequence. */
  public A018192() {
    super(1);
  }

  // After Alexander Stoimenow

  protected Z gamma(final int d, final int c) {
    if ((c & 1) == 0) {
      Z sum = Z.ZERO;
      Z zc = Z.ONE;
      for (int i = 0; i <= d / 2; ++i) {
        if (i > 0) {
          zc = zc.multiply(c);
        }
        sum = sum.add(Binomial.binomial(d, 2L * i).multiply(zc).multiply(mF.doubleFactorial(2 * i - 1)));
      }
      return sum;
    } else if ((d & 1) == 0) {
      return Z.valueOf(c).pow(d / 2).multiply(mF.doubleFactorial(d - 1));
    } else {
      return Z.ZERO;
    }
  }

  protected Z lambda(final int e, final int d, final int c) {
    return Binomial.binomial(e + d - 1, e).multiply(gamma(e, c));
  }

  protected Polynomial<Z> lambdaStarSeries(final int c, final int k, final int n) {
    final Z[] series = new Z[n + 1];
    for (int d = 0; d <= n; ++d) {
      series[d] = lambda(d, k, c);
    }
    return Polynomial.create(series);
  }

  private Polynomial<Z> xiSeries(final int c, final int k, final int n) {
    final Z[] t = new Z[n + 1];
    for (int d = 0; d <= n; ++d) {
      t[d] = xi(c, d, k);
    }
    return Polynomial.create(t);
  }

  protected Z xiBar(final int c, final int d, final int k) {
    final int n = d - 2;
    return RING.multiply(RING.diff(psiBarSeries(n).substitutePower(2, n).shift(1)), xiSeries(c, k - 1, n), n).coeff(n);
  }

  protected Z xi(final int c, final int d, final int k) {
    final int n = d - 2 * k;
    if (n < 0 || k < 0) {
      return Z.ZERO;
    }
    return RING.multiply(RING.pow(psiBarSeries(n).substitutePower(2, n), k, n), lambdaStarSeries(c, k + 1, n), n).coeff(n);
  }

  protected Z zeta(final int c, final int d, final int k) {
    return xi(c, d, k).add(xiBar(c, d, k));
  }

  protected Z eta(final int c, final int d) {
    Z sum = Z.ZERO;
    for (int k = 1; k <= d / 2; ++k) {
      sum = sum.signedAdd((k & 1) == 1, zeta(c, d, k));
    }
    return sum;
  }

  protected Z lambda(final int n) {
    return mF.doubleFactorial(2 * n - 1);
  }

  private Z psi(final int n) {
    return lambda(n).subtract(psiBarSeries(n).coeff(n));
  }

  private Z psiBar2(final int n, final int i) {
    return RING.multiply(RING.pow(psiBarSeries(n - 1), i), lambda2Series(i + 1, n), n).coeff(n - i);
  }

  protected Polynomial<Z> lambda2Series(final int i, final int n) {
    final Z[] series = new Z[n + 1];
    for (int d = 0; d <= n; ++d) {
      series[d] = lambda(d, i);
    }
    return Polynomial.create(series);
  }

  private Z psiBar(final int n) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= n; ++i) {
      sum = sum.signedAdd((i & 1) == 0, psiBar2(n, i));
    }
    return sum;
  }

  protected Z gammaTilde(final int d, final int c) {
    if (c == 1) {
      return (d & 1) == 0 ? psi(d / 2) : Z.ZERO;
    }
    if (c == 2) {
      return eta(2, d).add((d & 1) == 1 ? psiBar((d - 1) / 2).multiply(d) : Z.ZERO);
    } else {
      assert c > 2;
      return eta(c, d);
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final int n2 = 2 * mN;
    for (final Z dd : Jaguar.factor(n2).divisors()) {
      final int d = dd.intValue();
      final int c = n2 / d;
      sum = sum.add(gammaTilde(d, c).multiply(Functions.PHI.l((long) c)));
    }
    return sum.divide(n2);
  }
}

