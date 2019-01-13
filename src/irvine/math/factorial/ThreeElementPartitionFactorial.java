package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Compute factorial by partitioning.  This implementation is only
 * safe up to <code>n</code>=2^21=2097152.
 *
 * @author Sean A. Irvine
 */
public class ThreeElementPartitionFactorial implements Factorial {

  @Override
  public Z factorial(final int n) {
    if (n <= 2) {
      if (n < 0) {
        throw new IllegalArgumentException("n must be nonnegative");
      }
      if (n == 2) {
        return Z.TWO;
      }
      return Z.ONE;
    }
    long x = 6;
    long d0 = 114;
    long d1 = 270;
    Z r = Z.SIX;
    int iterations = n / 3;

    while (--iterations > 0) {
      x += d0;
      d0 += d1;
      d1 += 162;
      r = r.multiply(Z.valueOf(x));
    }

    final int e = n % 3;
    if (e == 2) {
      r = r.multiply(Z.valueOf((long) n * (n - 1)));
    } else if (e == 1) {
      r = r.multiply(Z.valueOf(n));
    }

    return r;
  }

  @Override
  public Z doubleFactorial(final int n) {
    throw new UnsupportedOperationException();
  }
}
