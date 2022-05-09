package irvine.math;

import java.util.HashMap;

import irvine.util.Triple;

/**
 * Definition of a three argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <S> argument type
 * @param <R> result type
 */
public abstract class MemoryFunction3<S, R> {

  private final HashMap<Triple<S>, R> mCache = new HashMap<>();

  /**
   * Compute the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @return value of function
   */
  protected abstract R compute(final S a, final S b, final S c);

  /**
   * Return the value of the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @return value of function
   */
  public R get(final S a, final S b, final S c) {
    final Triple<S> key = new Triple<>(a, b, c);
    final R res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(a, b, c);
    mCache.put(key, r);
    return r;
  }
}
