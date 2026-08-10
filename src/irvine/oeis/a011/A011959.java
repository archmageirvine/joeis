package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011959 Number of SiC polytypes that repeat after 2n layers.
 * @author Sean A. Irvine
 */
public class A011959 extends Sequence1 {

  private int mN = 0;

  /**
   * E1(N,S), equation from McLarnan.
   * @param n N
   * @param s S
   * @return E1(N,S)
   */
  private Z e1(final int n, final int s) {
    Z sum = Z.ZERO;
    final int g = Functions.GCD.i(n, s);
    for (int d = 1; d <= g; ++d) {
      if (g % d != 0) {
        continue;
      }
      final int m = n / d;
      final int sd = s / d;
      final int hi = sd - 2 * m;
      if (hi < 2 * m) {
        continue;
      }
      final Z phi = Functions.PHI.z(d);
      for (int t = 2 * m; t <= hi; ++t) {
        if ((s + t * d) % 3 != 0) {
          continue;
        }
        final Z c1 = Binomial.binomial(t - m - 1, m - 1);
        final Z c2 = Binomial.binomial(sd - t - m - 1, m - 1);
        sum = sum.add(phi.multiply(c1).multiply(c2));
      }
    }
    return sum.divide(n);
  }

  /**
   * E2(N,S), equation from McLarnan.
   * If N = 2^a * n, n odd, put sigma = S / 2^(a+1).
   * @param n N
   * @param s S
   * @return E2(N,S)
   */
  private Z e2(final int n, final int s) {
    int a = 0;
    int odd = n;
    while ((odd & 1) == 0) {
      ++a;
      odd >>= 1;
    }

    final int scale = 1 << (a + 1);
    if (s % scale != 0) {
      return Z.ZERO;
    }

    final int sigma = s / scale;
    if (sigma < odd) {
      return Z.ZERO;
    }

    final int g = Functions.GCD.i(odd, sigma);
    Z sum = Z.ZERO;

    for (int d = 1; d <= g; ++d) {
      if (g % d != 0) {
        continue;
      }
      final int nd = odd / d;
      final int q = (sigma / d) - nd;
      if (q < 0) {
        continue;
      }
      sum = sum.add(Functions.PHI.z(d).multiply(Binomial.binomial(q - 1, nd - 1)));
    }
    return sum.divide(odd);
  }

  /**
   * Number of SiC polytypes whose layer-number divides s.
   * @param s S
   * @return B'(S)
   */
  private Z bPrime(final int s) {
    Z sum = Z.ZERO;
    for (int n = 1; 4 * n <= s; ++n) {
      sum = sum.add(e1(n, s).add(e2(n, s)).divide(2));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    // McLarnan explicitly inserts the cubic (sphalerite) SiC polytype.
    if (mN == 3) {
      return Z.ONE;
    }
    // B(N) = sum_{d|N} mu(N/d) B'(d).
    Z sum = Z.ZERO;
    for (int d = 1; d <= mN; ++d) {
      if (mN % d == 0) {
        sum = sum.add(bPrime(d).multiply(Functions.MOBIUS.l(mN / d)));
      }
    }
    return sum;
  }
}
