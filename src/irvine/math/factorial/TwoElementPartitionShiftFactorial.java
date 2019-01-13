package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Compute factorial by partitioning.  Includes special handling
 * for even numbers thereby reducing the size of the intermediate
 * products.
 *
 * @author Sean A. Irvine
 */
public class TwoElementPartitionShiftFactorial implements Factorial {

  @Override
  public Z factorial(final int n) {
    if (n < 2) {
      if (n < 0) {
        throw new IllegalArgumentException("n must be nonnegative");
      }
      return Z.ONE;
    }
    long x = 1L;
    long d = 5L;
    Z r = Z.ONE;
    final int shift = n >>> 1;
    int iterations = shift;

    while (--iterations > 0) {
      x += d;
      d += 4L;
      r = r.multiply(Z.valueOf(x));
    }

    if ((n & 1) != 0) {
      r = r.multiply(Z.valueOf(n));
    }

    return r.shiftLeft(shift);
  }

  @Override
  public Z doubleFactorial(final int n) {
    throw new UnsupportedOperationException();
  }

}
