package irvine.math;

import java.util.HashMap;

/**
 * Definition of a four argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <R> result type
 */
public abstract class MemoryFunctionInt4<R> extends HashMap<String, R> {

  /**
   * Compute the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param d fourth parameter
   * @return value of function
   */
  protected abstract R compute(final int a, final int b, final int c, final int d);

  /**
   * Return the value of the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param d fourth parameter
   * @return value of function
   */
  public R get(final int a, final int b, final int c, final int d) {
    final String key = a + "," + b + "," + c + "," + d;
    final R res = get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(a, b, c, d);
    put(key, r);
    return r;
  }
}


