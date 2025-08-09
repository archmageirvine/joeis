package irvine.math.series;

import irvine.math.api.Field;
import irvine.math.function.Functions;

/**
 * Apply the Laplace transform to a series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Laplace<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;

  Laplace(final Field<E> elementField, final Series<E> s) {
    mElementField = elementField;
    mS = s;
  }

  @Override
  public E coeff(final int n) {
    return mElementField.multiply(mS.coeff(n), mElementField.coerce(Functions.FACTORIAL.z(n)));
  }

  @Override
  public int bound() {
    return mS.bound();
  }
}
