package irvine.math.group;

import java.util.Map;

import irvine.math.api.Field;
import irvine.math.polynomial.QPolynomial;
import irvine.math.q.Q;

/**
 * A polynomial where individuals elements are drawn from a ring.
 * @author Sean A. Irvine
 * @param <E> underlying type of polynomial elements
 */
public class QPolynomialRingField<E> extends QPolynomialRing<E> {

  private final Field<E> mElementField;

  /**
   * Construct a new polynomial ring for matrices of a specified size.
   * @param indeterminate the indeterminate for the ring
   * @param elementField ring of underlying elements
   */
  public QPolynomialRingField(final String indeterminate, final Field<E> elementField) {
    super(indeterminate, elementField);
    mElementField = elementField;
  }

  /**
   * Construct a new polynomial ring for matrices of a specified size.
   * @param elementField ring of underlying elements
   */
  public QPolynomialRingField(final Field<E> elementField) {
    this("x", elementField);
  }

  /**
   * Get the field of the polynomial coefficients.
   * @return coefficient field
   */
  public Field<E> coefficientField() {
    return mElementField;
  }

  /**
   * Return the polynomial divided by the specified value.
   * @param p polynomial
   * @param n dividend
   * @return polynomial
   */
  public QPolynomial<E> divide(final QPolynomial<E> p, final E n) {
    if (mOne.equals(n)) {
      return p;
    }
    final QPolynomial<E> c = new QPolynomial<>(mIndeterminate, mZero, mOne);
    for (final Map.Entry<Q, E> e : p.entrySet()) {
      c.put(e.getKey(), mElementField.divide(e.getValue(), n));
    }
    return c;
  }
}
