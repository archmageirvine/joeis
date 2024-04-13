package irvine.math.set;

import java.util.HashSet;

import irvine.math.IntegerUtils;
import irvine.math.api.Function;
import irvine.math.api.Set;

/**
 * Default implementation of some function related methods.
 * @author Sean A. Irvine
 * @param <D> domain element type
 * @param <R> codomain element type
 */
public abstract class AbstractFunction<D, R> extends DefaultInfiniteEffort implements Function<D, R> {

  private final Set<D> mDomain;
  private final Set<R> mCodomain;

  /**
   * A function from a domain into a codomain.
   * @param domain the domain
   * @param codomain the codomain
   */
  public AbstractFunction(final Set<D> domain, final Set<R> codomain) {
    if (domain == null || codomain == null) {
      throw new NullPointerException();
    }
    mDomain = domain;
    mCodomain = codomain;
  }

  protected void abortOnInfiniteDomain() {
    domain().abortOnInfinite();
  }

  @Override
  public Set<D> domain() {
    return mDomain;
  }

  @Override
  public Set<R> codomain() {
    return mCodomain;
  }

  @Override
  public Set<R> image(final Set<D> s) {
    // This works by enumerating all elements, so we definitely cannot do it for infinite sets.
    s.abortOnInfinite();
    final HashSet<R> image = new HashSet<>();
    for (final D element : s) {
      image.add(image(element));
    }
    return new FiniteSet<>(image);
  }

  @Override
  public Set<R> image() {
    abortOnInfiniteDomain();
    return image(domain());
  }

  @Override
  public boolean isOnto() {
    abortOnInfiniteDomain();
    return image().size().equals(codomain().size());
  }

  @Override
  public boolean isOneToOne() {
    abortOnInfiniteDomain();
    return image().size().equals(domain().size());
  }

  @Override
  public boolean isInvertible() {
    return isOneToOne() && isOnto();
  }

  @SuppressWarnings("unchecked")
  private Function<D, R> forceFunctionType(final Object fn) {
    return (Function<D, R>) fn;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Function<?, ?>)) {
      return false;
    }
    final Function<?, ?> that = (Function<?, ?>) obj;
    if (that.domain().equals(domain()) && that.codomain().equals(codomain())) {
      final boolean infiniteDomain = domain().isInfinite();
      final long effort = getInfiniteEffort();
      long k = 0;
      // The next cast is safe because we already determined the sets are the same.
      final Function<D, R> that2 = forceFunctionType(obj);
      for (final D element : domain()) {
        if (!image(element).equals(that2.image(element))) {
          return false;
        }
        if (infiniteDomain && ++k == effort) {
          // Set has infinite domain, but we were unable to find a counter-example
          // within the effort limit.
          throw new EffortException();
        }
      }
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    // This hashcode is brittle for sets larger than MAX_TERMS_CONTRIBUTING_TO_HASH
    // because the hash might change for functions that are actually equal
    int hash = IntegerUtils.hash(domain().hashCode(), codomain().hashCode());
    int k = 0;
    for (final D d : domain()) {
      final int h = IntegerUtils.hash(d.hashCode(), image(d).hashCode());
      hash = IntegerUtils.hash(hash, h);
      if (++k == AbstractSet.MAX_TERMS_CONTRIBUTING_TO_HASH) {
        break;
      }
    }
    return hash;
  }
}
