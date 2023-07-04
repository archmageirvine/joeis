package irvine.math;

import java.util.HashMap;

/**
 * Definition of a one argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <S> argument type
 * @param <R> result type
 */
public abstract class MemoryFunction<S, R> extends HashMap<S, R> {

  /**
   * Compute the function at specified parameters.
   * @param key first parameter
   * @return value of function
   */
  protected abstract R compute(final S key);

  /**
   * Return the value of the function at specified parameters.
   * @param key first parameter
   * @return value of function
   */
  public R getValue(final S key) {
    final R res = get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(key);
    put(key, r);
    return r;
  }
}
