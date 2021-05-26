package irvine.math;

import java.util.HashMap;

/**
 * Definition of a five argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <R> result type
 */
public abstract class MemoryFunctionInt5<R> extends HashMap<String, R> {

  /**
   * Compute the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param d fourth parameter
   * @param e fifth parameter
   * @return value of function
   */
  protected abstract R compute(final int a, final int b, final int c, final int d, final int e);

  /**
   * Return the value of the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param d fourth parameter
   * @param e fifth parameter
   * @return value of function
   */
  public R get(final int a, final int b, final int c, final int d, final int e) {
    final String key = a + "," + b + "," + c + "," + d + "," + e;
    final R res = get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(a, b, c, d, e);
    put(key, r);
    return r;
  }
}


