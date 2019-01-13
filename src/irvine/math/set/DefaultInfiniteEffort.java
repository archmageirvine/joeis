package irvine.math.set;

import irvine.math.api.InfiniteEffort;

/**
 * Default implementation of <code>InfiniteEffort</code>.
 *
 * @author Sean A. Irvine
 */
public class DefaultInfiniteEffort implements InfiniteEffort {

  private static final long DEFAULT_INFINITE_EFFORT = 1000;

  private long mEffort = DEFAULT_INFINITE_EFFORT;

  @Override
  public void setInfiniteEffort(final long effort) {
    mEffort = effort;
  }

  @Override
  public long getInfiniteEffort() {
    return mEffort;
  }
}
