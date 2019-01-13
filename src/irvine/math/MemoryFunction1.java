package irvine.math;

import java.util.ArrayList;

/**
 * Definition of a single argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <R> result type
 */
public abstract class MemoryFunction1<R> {

  private final ArrayList<R> mCache = new ArrayList<>();

  /**
   * Compute the function at specified parameter.
   * @param n parameter
   * @return value of function
   */
  protected abstract R compute(final int n);

  /**
   * Return the value of the function at specified parameter.
   * @param n parameter
   * @return value of function
   */
  public R get(final int n) {
    while (n >= mCache.size()) {
      mCache.add(compute(mCache.size()));
    }
    return mCache.get(n);
  }
}


