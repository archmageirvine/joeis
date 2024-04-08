package irvine.math.monoid;

/**
 * Count monoids.
 * @author Sean A. Irvine
 */
public class CountMonoidProcessor implements MonoidProcessor {

  private long mCount = 0;

  @Override
  public void process(final int[][] monoid) {
    ++mCount;
  }

  /**
   * Get the count of monoids.
   * @return the count
   */
  public long getCount() {
    return mCount;
  }
}
