package irvine.math.padic;

import java.util.Arrays;

/**
 * A finite p-adic expansion.
 * @author Sean A. Irvine
*/
public class FinitePAdic extends AbstractPAdic {

  private final long mPrime;
  private final long[] mExpansion;

  FinitePAdic(final long p, final long... n) {
    for (final long v : n) {
      if (v < 0 || v >= p) {
        throw new IllegalArgumentException();
      }
    }
    mPrime = p;
    mExpansion = Arrays.copyOf(n, n.length);
  }

  @Override
  public long get(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return n >= mExpansion.length ? 0 : mExpansion[n];
  }

  @Override
  public long p() {
    return mPrime;
  }
}
