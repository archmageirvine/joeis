package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394611 allocated for Joshua B. Weinstein.
 * @author Sean A. Irvine
 */
public class A394611 extends CachedSequence {

  protected final LongDynamicLongArray mCounts = new LongDynamicLongArray();

  /** Construct the sequence. */
  public A394611() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    if (n == 1) {
      return Z.ZERO;
    }
    final long res = mCounts.get(a(n - 1).longValueExact());
    for (long k = 1; k < n; ++k) {
      mCounts.increment(a(k).longValue() + res);
    }
    return Z.valueOf(res);
  }
}
