package irvine.math.group;


import irvine.math.api.Field;
import irvine.math.api.Group;

/**
 * Default implementation of certain field methods.
 * @author Sean A. Irvine
 * @param <E> underlying element type
 */
public abstract class AbstractOrderedField<E> extends AbstractOrderedIntegralDomain<E> implements Field<E> {

  // Essentially a replication of AbstractField but inheriting ordering methods

  @Override
  public E pow(final E a, final long n) {
    return AbstractField.pow(this, a, n);
  }

  @Override
  public E divide(final E n, final E d) {
    return multiply(n, inverse(d));
  }

  @Override
  public Group<E> multiplicativeGroup() {
    return new MultiplicativeGroup<>(this);
  }
}
