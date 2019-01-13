package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Compute factorial by partitioning.
 *
 * @author Sean A. Irvine
 */
public class TwoElementPartitionFactorial implements Factorial {

  @Override
  public Z factorial(final int n) {
    if (n < 2) {
      if (n < 0) {
        throw new IllegalArgumentException("n must be nonnegative");
      }
      return Z.ONE;
    }
    long x = 2L;
    long d = 10L;
    Z r = Z.TWO;
    int iterations = n >>> 1;

    while (--iterations > 0) {
      x += d;
      d += 8L;
      r = r.multiply(Z.valueOf(x));
    }

    if ((n & 1) != 0) {
      r = r.multiply(Z.valueOf(n));
    }

    return r;
  }

  @Override
  public Z doubleFactorial(final int n) {
    throw new UnsupportedOperationException();
  }

}
