package irvine.math.set;

import java.util.ArrayList;
import java.util.List;

import irvine.math.api.Function;
import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.CollectionUtils;

/**
 * Default implementation of some methods.
 * @author Sean A. Irvine
 * @param <E> element type
 */
public abstract class AbstractSet<E> extends DefaultInfiniteEffort implements Set<E> {

  @Override
  public boolean isEmpty() {
    return Z.ZERO.equals(size());
  }

  @Override
  public boolean isInfinite() {
    return size() == null;
  }

  @Override
  public void abortOnInfinite() {
    if (isInfinite()) {
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public Set<E> union(final Set<E> other) {
    return Union.union(this, other);
  }

  @Override
  public Set<E> intersection(final Set<E> other) {
    return Intersection.intersection(this, other);
  }

  @Override
  public Set<Set<E>> powerset() {
    return new PowerSet<>(this);
  }

  @Override
  public boolean isSubset(final Set<E> set) {
    if (set == this || set.isEmpty()) {
      return true;
    }
    if (set.isInfinite()) {
      if (!isInfinite()) {
        return false;
      }
    } else if (!isInfinite() && size().compareTo(set.size()) < 0) {
      return false;
    }
    // Either both sets are infinite or the subset is smaller
    final long effort = getInfiniteEffort();
    long k = 0;
    for (final E e : set) {
      if (!contains(e)) {
        return false;
      }
      if (isInfinite() && ++k == effort) {
        throw new EffortException();
      }
    }
    return true;
  }

  /**
   * Test if two sets have the same size.  Works for both finite and infinite
   * sets, although all infinite sets are assumed to have the same size, hence
   * the set of integers is assumed (incorrectly) to have the same size as the
   * set of real numbers.
   * @param a first set
   * @param b second set
   * @return true iff the two sets have the same cardinality
   */
  public static boolean sameSize(final Set<?> a, final Set<?> b) {
    if (a.isInfinite()) {
      return b.isInfinite();
    }
    return a.size().equals(b.size());
  }

  @Override
  public List<E> asList() {
    if (isInfinite() || size().bitLength() > 31) {
      throw new UnsupportedOperationException();
    }
    final List<E> list = new ArrayList<>(size().intValue());
    for (final E e : this) {
      list.add(e);
    }
    // Sort for consistent ordering of elements on different JVMs
    CollectionUtils.sort(list);
    return list;
  }

  @Override
  public Function<E, E> identityFunction() {
    return new IdentityFunction<>(this);
  }

  /**
   * Assuming this set and the supplied set are the same size, check if the
   * set contain the same elements.
   * @param other the other set
   * @return true if the sets contain the same elements
   */
  protected boolean elementEquals(final Set<E> other) {
    final long effort = getInfiniteEffort();
    long k = 0;
    for (final E e : this) {
      if (!other.contains(e)) {
        return false;
      }
      if (isInfinite() && ++k == effort) {
        throw new EffortException();
      }
    }
    return true;
  }

  @Override
  public boolean equals(final Object that) {
    if (this == that) {
      return true;
    }
    if (!(that instanceof Set<?>)) {
      return false;
    }
    if (!sameSize(this, (Set<?>) that)) {
      return false;
    }
    if (isEmpty()) {
      return true; // empty sets equal irrespective of type
    }
    // Generics in Java are a pain here.  We cannot tell at runtime that the
    // types of the set match.  Hence the following contortions attempt to
    // check it via the first element in each set.
    final E a = iterator().next(); // we know size > 0
    final Object b = ((Set<?>) that).iterator().next();
    if (!a.getClass().isInstance(b) || !b.getClass().isInstance(a)) {
      return false;
    }
    @SuppressWarnings("unchecked")
    final Set<E> other = (Set<E>) that;
    return elementEquals(other);
  }

  // Limits calculation of hashcode in case of large or infinite sets
  static final int MAX_TERMS_CONTRIBUTING_TO_HASH = 100;

  @Override
  public int hashCode() {
    // Note: This hashcode is actually rather brittle and can break the Java
    // contract if the set contains more than MAX_TERMS_CONTRIBUTING_TO_HASH,
    // because then the hash depends on the order in which elements are
    // returned from the iterator.  That is, there exist sets which are
    // equal but which have different hashcodes.
    int hash = 0;
    int k = 0;
    for (final E e : this) {
      hash ^= e.hashCode();
      if (++k == MAX_TERMS_CONTRIBUTING_TO_HASH) {
        break;
      }
    }
    return hash;
  }

}
