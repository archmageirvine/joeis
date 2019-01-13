package irvine.math.api;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Default implementation of certain ring methods.
 * @author Sean A. Irvine
 * @param <E> underlying element type
 */
public interface OrderedIntegralDomain<E> extends Comparator<E>, Serializable {

  /**
   * Greater than.
   * @param a first number
   * @param b second number
   * @return true iff <code>a&gt;b</code> in the ordering of the domain
   */
  boolean gt(final E a, final E b);

  /**
   * Less than.
   * @param a first number
   * @param b second number
   * @return true iff <code>a&lt;b</code> in the ordering of the domain
   */
  boolean lt(final E a, final E b);

  /**
   * Absolute value.
   * @param a element to get absolute value of
   * @return absolute value
   */
  E abs(final E a);

}
