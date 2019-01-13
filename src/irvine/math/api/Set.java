package irvine.math.api;

import irvine.math.z.Z;

import java.util.Iterator;
import java.util.List;

/**
 * Definition of an immutable set.
 *
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Set<E> extends Iterable<E>, InfiniteEffort {

  /**
   * Return the cardinality of the set.  If the set is infinite then
   * null is returned.
   * @return cardinality of set or null for an infinite set
   */
  Z size();

  /**
   * True iff the contains no elements.
   * @return true iff the set has cardinality zero
   */
  boolean isEmpty();

  /**
   * True iff the set contains an infinite number of elements.
   * @return true iff the set has infinite cardinality
   */
  boolean isInfinite();

  /**
   * Throws an <code>UnsupportedOperationException</code> if the set is
   * infinite.
   */
  void abortOnInfinite();

  /**
   * Test if the set contains the specified element.  Null is a valid
   * element to test for.
   * @param element element to test
   * @return true if element is in the set
   */
  boolean contains(E element);

  /**
   * Test if the given set is a subset of the specified set.
   * @param set putative subset
   * @return true iff if the given set is a subset of this set
   * @throws UnsupportedOperationException of the determination cannot be
   * made.
   */
  boolean isSubset(Set<E> set);

  /**
   * Form the union of this set with another set over elements of the same
   * type. That is, form a set that will contain all the elements appearing
   * either in this set or the given set.
   * @param other other set
   * @return the union
   */
  Set<E> union(Set<E> other);

  /**
   * Form the intersection of this set with another set over elements of the same
   * type. That is, form a set that will contain all the elements appearing
   * in both sets.
   * @param other other set
   * @return the intersection
   */
  Set<E> intersection(Set<E> other);
  
  /**
   * Form the power set of this set.  That is, construct a set comprising all
   * possible subsets of this set.
   * @return the power set
   */
  Set<Set<E>> powerset();

  /**
   * Return an iterator over the elements of a set.
   * @return an iterator
   */
  @Override
  Iterator<E> iterator();

  /**
   * Return the identity function for the set.
   * @return the identity function
   */
  Function<E, E> identityFunction();

  /**
   * Return the elements of this set as a list.  If possible the items in
   * the list are sorted in their natural order.  This is an
   * <code>O(size())</code> operation in most representations.
   * @return set it list form
   * @throws UnsupportedOperationException if the set is infinite or too
   * large to represent in a list.
   */
  List<E> asList();
}
