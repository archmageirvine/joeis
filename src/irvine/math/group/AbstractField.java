package irvine.math.group;

import irvine.math.api.Field;
import irvine.math.api.Group;
import irvine.math.api.Ring;

/**
 * Default implementation of certain field methods.
 * @author Sean A. Irvine
 * @param <E> underlying element type
 */
public abstract class AbstractField<E> extends AbstractIntegralDomain<E> implements Field<E> {

  /**
   * Powering. Computes <code>b^n</code>. Made available as a static so it
   * can be called in cases where it is impossible to be an instance of this
   * class.
   * @param <E> element type
   * @param b base
   * @param n n
   * @param field the base field
   * @return <code>b^n</code>
   */
  static <E> E pow(final E b, final long n, final Field<E> field) {
    if (n < 0) {
      return AbstractRing.pow(field, field.inverse(b), -n);
    } else {
      return AbstractRing.pow(field, b, n);
    }
  }

  @Override
  public E pow(final E a, final long n) {
    return pow(this, a, n);
  }

  @Override
  public E divide(final E n, final E d) {
    return multiply(n, inverse(d));
  }

  @Override
  public Group<E> multiplicativeGroup() {
    return new MultiplicativeGroup<>(this);
  }

  @Override
  public Ring<E> ideal(final E element) {
    // Field F only has ideals {0} and F itself
    if (!element.equals(zero())) {
      return this;
    }
    return super.ideal(element);
  }
}
