package irvine.math.api;

/**
 * Definition of a probability distribution over a given event type.
 *
 * @author Sean A. Irvine
 * @param <E> event type
 */
public interface Distribution<E> {

  /**
   * Return the probability of the given event.
   * @param event the event
   * @return probability of event
   */
  double p(final E event);

  /**
   * Return the natural logarithm of the probability of the given event.
   * @param event the event
   * @return log probability of event
   */
  double lnP(final E event);

  /**
   * Return the probability of the event comprising of values in the given
   * inclusive range.
   * @param min minimum
   * @param max maximum
   * @return probability of event
   * @throws UnsupportedOperationException if there is no ordering on the events
   * or if this cannot be computed for any other reason.
   */
  double p(final E min, final E max);

  /**
   * Return the natural logarithm of the probability of the event comprising
   * of values in the given inclusive range.
   * @param min minimum
   * @param max maximum
   * @return probability of event
   * @throws UnsupportedOperationException if there is no ordering on the events
   * or if this cannot be computed for any other reason.
   */
  double lnP(final E min, final E max);

  /**
   * Make a random selection from this distribution.
   * @return random event
   */
  E random();

  /**
   * Return the mean for this distribution, provided there is some way or
   * producing an ordinal numbering of the elements.
   * @return mean
   */
  double mean();

  /**
   * Return the variance for this distribution.
   * @return variance
   */
  double variance();
}
