package irvine.oeis.a011;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011961 Number of ferrites M_4Y_n that repeat after 6n+20 layers.
 * @author Sean A. Irvine
 */
public class A011961 extends Sequence1 {

  // After R. J. Mathar

  private Z k1(final int n, final int s) {
    Z sum = Z.ZERO;
    final long g = Functions.GCD.l(n / 2, s);
    for (final Z dz : Jaguar.factor(g).divisors()) {
      final int d = dz.intValueExact();
      final int m = s / d;
      final int nd = n / (2 * d);
      final Z phi = Functions.PHI.z(d);
      for (int t = 0; t <= m; ++t) {
        if ((s + (long) t * d) % 3 == 0) {
          sum = sum.add(phi.multiply(Functions.BINOMIAL.z(nd + t - 1, t).multiply(Functions.BINOMIAL.z(nd + m - 1 - t, m - t))));
        }
      }
    }
    return sum;
  }

  private Z k2(final int n, final int s) {
    assert (n & 1) == 0;
    Z sum = Z.ZERO;
    if ((n & 3) == 2) {
      final int m = (n - 2) / 4;
      for (int t = 0; t <= s; ++t) {
        if ((s + t) % 3 == 0) {
          sum = sum.add(Functions.BINOMIAL.z(m + t / 2, m).multiply(Functions.BINOMIAL.z(m + (s - t) / 2, m)));
        }
      }
    } else {
      final int m = n / 4;
      final int sh = s / 2;
      for (int t = 0; t <= sh; ++t) {
        if ((s - t) % 3 == 0) {
          final Q b;
          if ((s & 1) == 0) {
            b = Q.TWO.subtract(new Q(n, n + 2L * s - 4L * t));
          } else {
            b = Q.TWO;
          }
          assert b.multiply(Functions.BINOMIAL.z(m + t - 1, t).multiply(Functions.BINOMIAL.z(sh + m - t, m))).isInteger();
          sum = sum.add(b.multiply(Functions.BINOMIAL.z(m + t - 1, t).multiply(Functions.BINOMIAL.z(sh + m - t, m))).toZ());
        }
      }
    }
    return sum.multiply(n / 2);
  }

  private Z k(final int n, final int s) {
    return k1(n, s).add(k2(n, s)).divide(n);
  }

  // Maple comment: actually computes 2V(N,S)-J(N,S)
  private Z j(final int n, final int s) {
    if ((s & 1) == 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    final long g = Functions.GCD.l(n, s);
    final long h = Functions.GCD.l(n / 2, s);
    for (final Z dz : Jaguar.factor(g).divisors()) {
      final int d = dz.intValueExact();
      if (h % d == 0) {
        continue;
      }
      sum = sum.add(Functions.PHI.z(d).multiply(Functions.BINOMIAL.z(n / d + s / d - 1, s / d)));
    }
    sum = sum.add(
      Z.valueOf((long) n * n).multiply(Functions.BINOMIAL.z(n / 2 + s / 2, s / 2)).divide(2L * n + 2L * s)
    );
    return sum.divide(n);
  }

  protected Z fPrime(final int n, final int s) {
    return k(n, s).add(j(n, s)).divide2();
  }

  protected Z f(final int n, final int s) {
    Z sum = Z.ZERO;
    final long g = Functions.GCD.l(n / 2, s);
    for (final Z dz : Jaguar.factor(g).divisors()) {
      final int d = dz.intValueExact();
      sum = sum.add(fPrime(n / d, s / d).multiply(Functions.MOBIUS.i(d)));
    }
    return sum;
  }

  private int mN = 0;

  @Override
  public Z next() {
    return f(4, ++mN);
  }
}
