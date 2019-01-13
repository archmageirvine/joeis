package irvine.math;

import irvine.util.Pair;

import java.util.HashMap;

/**
 * Definition of a two argument function that remembers previously computed results.
 * @author Sean A. Irvine
 * @param <S> argument type
 * @param <R> result type
 */
public abstract class MemoryFunction2<S, R> {

  private final HashMap<Pair<S, S>, R> mCache = new HashMap<>();

  /**
   * Compute the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @return value of function
   */
  protected abstract R compute(final S a, final S b);

  /**
   * Return the value of the function at specified parameters.
   * @param a first parameter
   * @param b second parameter
   * @return value of function
   */
  public R get(final S a, final S b) {
    final Pair<S, S> key = new Pair<>(a, b);
    final R res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final R r = compute(a, b);
    mCache.put(key, r);
    return r;
  }
}


