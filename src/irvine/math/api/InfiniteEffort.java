package irvine.math.api;

/**
 * Specification of a number guiding how much effort should be expended
 * attempting to resolve a potentially infinite calculation.  For
 * example, given two infinite sets of the same type and trying to
 * determine if they are equal by checking membership.  It is quite
 * possible to discover they are not equal by finding an element in one
 * set but not the other, but confirming equality would take an infinite
 * number of comparisons.  This interface defines a way to limit how
 * far a search should go.  The exact semantics of the limit is left to
 * the user, but throwing <code>EffortException</code> in
 * the case where a situation cannot be resolved might be a typical use.
 *
 * @author Sean A. Irvine
 */
public interface InfiniteEffort {

  /**
   * Set the amount of effort to be applied in a potentially infinite search.
   * @param effort effort level
   */
  void setInfiniteEffort(final long effort);

  /**
   * Get the amount of effort to be applied in a potentially infinite search.
   * @return effort level
   */
  long getInfiniteEffort();
}
