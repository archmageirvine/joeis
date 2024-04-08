package irvine.math.monoid;

import irvine.util.array.DynamicLongArray;

/**
 * Count number of idempotent elements in monoids.
 * @author Sean A. Irvine
 */
public class CountIdempotentsMonoidProcessor implements MonoidProcessor {

  private final DynamicLongArray mCounts = new DynamicLongArray();

  @Override
  public void process(final int[][] monoid) {
    int cnt = 0;
    for (int k = 0; k < monoid.length; ++k) {
      if (monoid[k][k] == k) {
        ++cnt;
      }
    }
    mCounts.increment(cnt);
  }

  /**
   * Get the count of monoids.
   * @return the count
   */
  public long getCount(final int t) {
    return mCounts.get(t);
  }
}
