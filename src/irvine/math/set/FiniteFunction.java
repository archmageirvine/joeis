package irvine.math.set;

import irvine.math.api.Set;
import irvine.util.Pair;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * A finite function backed by a <code>java.util.Map</code> or by
 * a function defined by explicit pairs.
 *
 * @author Sean A. Irvine
 * @param <D> domain element type
 * @param <R> codomain element type
 */
public class FiniteFunction<D, R> extends AbstractFunction<D, R> {

  private final Map<D, R> mMap;

  /**
   * Construct a new finite function from an explicit map with explicit
   * domain and explicit codomain.  It is the callers responsibility to
   * ensure the supplied domain and codomain are consistent with the
   * provided mapping.
   * @param domain explicit domain
   * @param codomain explicit codomain
   * @param mapping mapping defining the function
   */
  FiniteFunction(final Set<D> domain, final Set<R> codomain, final Map<D, R> mapping) {
    super(domain, codomain);
    mMap = mapping;
  }

  /**
   * Construct a new finite function from an explicit map with implicit
   * domain and explicit codomain.
   * @param codomain explicit codomain
   * @param mapping mapping defining the function
   */
  public FiniteFunction(final Set<R> codomain, final Map<D, R> mapping) {
    this(new FiniteSet<>(mapping.keySet()), codomain, mapping);
  }

  /**
   * Construct a new finite function from an explicit map with implicit
   * domain and codomain (range).
   * @param mapping mapping defining the function
   */
  public FiniteFunction(final Map<D, R> mapping) {
    this(new FiniteSet<>(new HashSet<>(mapping.values())), mapping);
  }

  private static <D, R> Map<D, R> createMap(final Set<R> codomain, final Collection<Pair<D, R>> pairs) {
    final HashMap<D, R> map = new HashMap<>();
    for (final Pair<D, R> p : pairs) {
      final D key = p.left();
      final R value = p.right();
      if (map.containsKey(key) || !codomain.contains(value)) {
        throw new IllegalArgumentException();
      }
      map.put(key, value);
    }
    return map;
  }

  /**
   * Construct a new finite function from an explicit map with implicit
   * domain and codomain (range).
   * @param domain explicit domain
   * @param codomain explicit codomain
   * @param map pairs defining the mapping
   * @throws IllegalArgumentException if the mapping is not a function
   */
  public FiniteFunction(final Set<D> domain, final Set<R> codomain, final Collection<Pair<D, R>> map) {
    this(domain, codomain, createMap(codomain, map));
  }

  @Override
  public R image(final D x) {
    return mMap.get(x);
  }
}
