package irvine.math;

import java.util.HashMap;

/**
 * Definition of a two argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <R> result type
 */
public abstract class MemoryFunctionInt2<R> extends HashMap<String, R> {

  /**
   * Compute the function at specified parameters.
   * @param n first parameter
   * @param m second parameter
   * @return value of function
   */
  protected abstract R compute(final int n, final int m);

  /**
   * Return the value of the function at specified parameters.
   * @param n first parameter
   * @param m second parameter
   * @return value of function
   */
  public R get(final int n, final int m) {
    final String key = n + "," + m;
    final R res = get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(n, m);
    put(key, r);
    return r;
  }
}


