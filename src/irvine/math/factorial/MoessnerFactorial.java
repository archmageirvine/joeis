package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Compute factorial by Moessner's method.
 *
 * @author Sean A. Irvine
 */
public class MoessnerFactorial implements Factorial {

  @Override
  public Z factorial(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be nonnegative");
    }
    final Z[] s = new Z[n + 1];
    s[0] = Z.ONE;
    for (int m = 1; m <= n; ++m) {
      s[m] = Z.ZERO;
      for (int k = m; k >= 1; --k) {
        for (int i = 1; i <= k; ++i) {
          s[i] = s[i].add(s[i - 1]);
        }
      }
    }

    return s[n];
  }

  @Override
  public Z doubleFactorial(final int n) {
    throw new UnsupportedOperationException();
  }
}
