package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Compute factorial by partitioning.  This implementation is only
 * safe for <code>n</code> &lt; 55112.
 *
 * @author Sean A. Irvine
 */
public class FourElementPartitionFactorial implements Factorial {

  private static final Z TWENTY_FOUR = Z.valueOf(24L);

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
    long x = 24;
    long d0 = 1656;
    long d1 = 8544;
    long d2 = 13056;
    Z r = TWENTY_FOUR;
    int iterations = n >>> 2;

    while (--iterations > 0) {
      x += d0;
      d0 += d1;
      d1 += d2;
      d2 += 6144;
      r = r.multiply(Z.valueOf(x));
    }

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
