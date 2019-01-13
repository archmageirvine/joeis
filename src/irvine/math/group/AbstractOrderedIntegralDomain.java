package irvine.math.group;

import irvine.math.api.OrderedIntegralDomain;

/**
 * Default implementation of ordering methods.
 * @author Sean A. Irvine
 * @param <E> underlying element type
 */
public abstract class AbstractOrderedIntegralDomain<E> extends AbstractIntegralDomain<E> implements OrderedIntegralDomain<E> {

  @Override
  public boolean gt(final E a, final E b) {
    return compare(a, b) > 0;
  }

  @Override
  public boolean lt(final E a, final E b) {
    return compare(a, b) < 0;
  }

  @Override
  public E abs(final E a) {
    return lt(a, zero()) ? negate(a) : a;
  }
}
