package irvine.math.api;

/**
 * A quotient group.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public interface QuotientGroup<T> extends Group<Set<T>> {

  /**
   * Return the natural homomorphism from the parent group to this group.
   * @return natural homomorphism
   */
  Function<T, Set<T>> naturalHomomorphism();
}
