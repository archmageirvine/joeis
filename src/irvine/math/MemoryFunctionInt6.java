package irvine.math;

import java.util.HashMap;

/**
 * Definition of a six argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <R> result type
 */
public abstract class MemoryFunctionInt6<R> extends HashMap<String, R> {

  /**
   * Compute the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param d fourth parameter
   * @param e fifth parameter
   * @param f sixth parameter
   * @return value of function
   */
  protected abstract R compute(final int a, final int b, final int c, final int d, final int e, final int f);

  /**
   * Return the value of the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param d fourth parameter
   * @param e fifth parameter
   * @param f sixth parameter
   * @return value of function
   */
  public R get(final int a, final int b, final int c, final int d, final int e, final int f) {
    final String key = a + "," + b + "," + c + "," + d + "," + e + "," + f;
    final R res = get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(a, b, c, d, e, f);
    put(key, r);
    return r;
  }
}


