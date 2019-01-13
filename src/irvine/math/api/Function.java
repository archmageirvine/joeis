package irvine.math.api;

/**
 * Definition of an arbitrary function between set elements. The domain and
 * codomain (roughly speaking, range) can be different sets.  Such an
 * arrangement is also called a mapping.
 *
 * @author Sean A. Irvine
 * @param <D> domain element type
 * @param <R> codomain element type
 */
public interface Function<D, R> extends InfiniteEffort {

  /**
   * The domain of the function.
   * @return domain
   */
  Set<D> domain();

  /**
   * The codomain of the function.  In many cases this will be the same as
   * the range.
   * @return codomain
   */
  Set<R> codomain();

  /**
   * The function applied to a particular value.
   * @param x parameter
   * @return the value of the function at <code>x</code>
   */
  R image(final D x);

  /**
   * The set of possible values resulting from an application of the
   * function to each value in the supplied set.
   * @param s set of parameters
   * @return the set of values taken on by the function
   */
  Set<R> image(final Set<D> s);

  /**
   * The range of the function.  Often this will be the same as
   * the codomain; but strictly is restricted to those elements of
   * the codomain actually taken on by the function.
   * @return range of the function
   */
  Set<R> image();

  /**
   * Test if the function is an onto relationship.  That is, returns true
   * if the image of this function is the codomain.
   * @return true if the function is onto
   */
  boolean isOnto();

  /**
   * Test if the function is one-to-one.  A function is one-to-one is
   * each element of the domain maps to a different element of the
   * codomain.
   * @return true if the function is one-to-one
   */
  boolean isOneToOne();

  /**
   * Test if the function is theoretically invertible.
   * @return true if the function is invertible.
   */
  boolean isInvertible();
}
