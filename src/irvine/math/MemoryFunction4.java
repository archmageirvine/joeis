package irvine.math;

import java.util.HashMap;

import irvine.util.Quadruple;

/**
 * Definition of a three argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <S> argument type
 * @param <R> result type
 */
public abstract class MemoryFunction4<S, R> {

  private final HashMap<Quadruple<S>, R> mCache = new HashMap<>();

  /**
   * Compute the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param d fourth parameter
   * @return value of function
   */
  protected abstract R compute(final S a, final S b, final S c, final S d);

  /**
   * Return the value of the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param d fourth parameter
   * @return value of function
   */
  public R get(final S a, final S b, final S c, final S d) {
    final Quadruple<S> key = new Quadruple<>(a, b, c, d);
    final R res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(a, b, c, d);
    mCache.put(key, r);
    return r;
  }
}


