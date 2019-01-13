package irvine.math.api;

import irvine.util.Pair;

/**
 * Definition of a fairly arbitrary operation.  Viewed as a mapping
 * <code>S&times;S</code> to <code>S</code>.
 *
 * @author Sean A. Irvine
 * @param <S> set the operation is defined on
 */
public interface Operation<S> extends Function<Pair<S, S>, S> {

  /**
   * Application of the operation.
   * @param a first element
   * @param b second element
   * @return <code>a op b</code>
   */
  S op(final S a, final S b);

  /**
   * Is the operation associative?
   * @return true if associative.
   */
  boolean isAssociative();

  /**
   * Is the operation commutative.
   * @return true if commutative
   */
  boolean isCommutative();

  /**
   * Test if the specified element is an identity for the operation.
   * @param e element to test
   * @return true if element is an identity
   */
  boolean isIdentity(final S e);
}
