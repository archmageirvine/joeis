package irvine.math.api;

/**
 * Definition of hypergeometric functions.
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface Hypergeometric<E> {

  /**
   * Compute the hypergeometric function with the given upper and
   * lower parameters at the specified argument.  Due to the complexity
   * of this function, implementations are free to throw various
   * exceptions if the computation cannot be performed.
   * @param upperParameters upper parameters
   * @param lowerParameters lower parameters
   * @param z argument
   * @return hypergeometric function
   */
  E hypergeometric(final E[] upperParameters, final E[] lowerParameters, final E z);


  /**
   * Compute the confluent hypergeometric function <code>F(a;b;z)</code>.
   * @param a parameter
   * @param b parameter
   * @param z argument
   * @return <code>F(a,b;z)</code>
   */
  E hypergeometric(final E a, final E b, final E z);

  /**
   * Compute the hypergeometric function <code>F(a,b;c;z)</code>.
   *
   * @param a parameter
   * @param b parameter
   * @param c parameter
   * @param z parameter
   * @return <code>F(a,b;c;z)</code>.
   */
  E hypergeometric(final E a, final E b, final E c, final E z);

  // Note further convenience definitions might be added in the future
}
