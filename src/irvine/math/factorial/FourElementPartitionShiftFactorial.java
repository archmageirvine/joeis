package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Compute factorial by partitioning.  This implementation is only
 * safe for <code>n</code> &lt; 440889.  Includes special handling
 * for even numbers thereby reducing the size of the intermediate
 * products.
 *
 * @author Sean A. Irvine
 */
public class FourElementPartitionShiftFactorial implements Factorial {

  @Override
  public Z factorial(final int n) {
    if (n <= 3) {
      if (n < 0) {
        throw new IllegalArgumentException("n must be nonnegative");
      }
      if (n == 2) {
        return Z.TWO;
      }
      if (n == 3) {
        return Z.SIX;
      }
      return Z.ONE;
    }
    long x = 3;
    long d0 = 207;
    long d1 = 1068;
    long d2 = 1632;
    Z r = Z.THREE;
    int iterations = n >>> 2;
    final int shift = 3 * iterations;

    while (--iterations > 0) {
      x += d0;
      d0 += d1;
      d1 += d2;
      d2 += 768;
      r = r.multiply(Z.valueOf(x));
    }

    r = r.shiftLeft(shift);

    switch (n & 3) {
    case 3:
      // long cast of n is critical to ensure product does not overflow
      return r.multiply(Z.valueOf((long) n * (n - 1) * (n - 2)));
    case 2:
      // long cast of n is critical to ensure product does not overflow
      return r.multiply(Z.valueOf((long) n * (n - 1)));
    case 1:
      return r.multiply(Z.valueOf(n));
    default:
      return r;
    }
  }

  @Override
  public Z doubleFactorial(final int n) {
    throw new UnsupportedOperationException();
  }
}
