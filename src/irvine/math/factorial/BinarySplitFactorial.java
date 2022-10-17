package irvine.math.factorial;

import irvine.math.z.Z;

/**
 * Compute factorials by binary splitting.
 * @author Sean A. Irvine
 */
public class BinarySplitFactorial implements Factorial {

  private Z f(final int low, final int high) {
    final int diff = high - low;
    if (diff <= 2) {
      // could handle 2 element case by recursion, but
      // since the product will fit in a long do it here
      // for a slight speed improvement
      if (diff == 2) {
        return Z.valueOf((long) high * (high - 1));
      }
      return Z.valueOf(high);
    }
    final int mid = (low + high) >>> 1;
    return f(low, mid).multiply(f(mid, high));
  }

  @Override
  public Z factorial(final int n) {
    if (n <= 1) {
      if (n < 0) {
        throw new IllegalArgumentException("n must be nonnegative");
      }
      return Z.ONE;
    }
    return f(0, n);
  }

  @Override
  public Z doubleFactorial(final int n) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Z multiFactorial(final int n, final int m) {
    throw new UnsupportedOperationException();
  }

}
