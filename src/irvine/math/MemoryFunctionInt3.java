package irvine.math;

import java.util.HashMap;

/**
 * Definition of a three argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <R> result type
 */
public abstract class MemoryFunctionInt3<R> extends HashMap<String, R> {

  /**
   * Compute the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @return value of function
   */
  protected abstract R compute(final int a, final int b, final int c);

  /**
   * Return the value of the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @return value of function
   */
  public R get(final int a, final int b, final int c) {
    final String key = a + "," + b + "," + c;
    final R res = get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(a, b, c);
    put(key, r);
    return r;
  }
}


