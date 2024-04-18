package irvine.math.function;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * Factorial function.
 * Uses a growing table or the binary split method depending on request.
 * @author Sean A. Irvine
 */
class Factorial extends AbstractFunction1 {

  // Convenience for all factorials which can fit in a long
  private static final long[] FACTORIAL = {1, 1, 2, 6, 24,
    120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L,
    20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L // 20!
  };

  private static final long EXTEND = 50;

  // Main table of remembered factorials
  private final List<Z> mFactorials = new ArrayList<>();
  {
    mFactorials.add(Z.ONE);
  }

  @Override
  public long l(final long n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n >= FACTORIAL.length) {
      throw new ArithmeticException(); // overflow
    }
    return FACTORIAL[(int) n];
  }

  // Compute high! by binary split method
  private Z f(final int low, final int high) {
    final int diff = high - low;
    if (diff <= 2) {
      // Could handle 2 element case by recursion, but
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
  public Z z(final int n) {
    if (n >= mFactorials.size()) {
      // Test if the new value is not too much longer than the existing table
      if (n <= mFactorials.size() + EXTEND) {
        // Extend existing table to accommodate new request
        Z f = mFactorials.get(mFactorials.size() - 1);
        for (long k = mFactorials.size(); k <= n; ++k) {
          f = f.multiply(k);
          mFactorials.add(f);
        }
      } else {
        // Otherwise, compute the factorial without the table
        return f(0, n);
      }
    }
    return mFactorials.get(n);
  }

  @Override
  public Z z(final Z n) {
    return z(n.intValueExact());
  }

  @Override
  public Z z(final long n) {
    if (n > Integer.MAX_VALUE) {
      throw new ArithmeticException(); // overflow
    }
    return z((int) n);
  }
}
