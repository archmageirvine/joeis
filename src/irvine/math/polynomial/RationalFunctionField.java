package irvine.math.polynomial;

import java.util.Iterator;

import irvine.math.api.Field;
import irvine.math.group.AbstractField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;

/**
 * Rational functions over a field.
 * @author Sean A. Irvine
 * @param <E> underlying element type
 */
public class RationalFunctionField<E> extends AbstractField<RationalFunction<E>> {

  private final Field<E> mElementField;
  private final PolynomialRingField<E> mPolyField;
  private final RationalFunction<E> mZero;
  private final RationalFunction<E> mOne;
  private final RationalFunction<E> mX;

  /**
   * Construct a new rational function field.
   * @param indeterminate the indeterminate for the field
   * @param elementField field of underlying elements
   */
  public RationalFunctionField(final String indeterminate, final Field<E> elementField) {
    mPolyField = new PolynomialRingField<>(indeterminate, elementField);
    mElementField = elementField;
    mZero = new RationalFunction<>(mPolyField.zero(), mPolyField.one());
    mOne = new RationalFunction<>(mPolyField.one(), mPolyField.one());
    mX = new RationalFunction<>(mPolyField.x(), mPolyField.one());
  }

  /**
   * Construct a new rational function field.
   * @param elementField field of underlying elements
   */
  public RationalFunctionField(final Field<E> elementField) {
    this("x", elementField);
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final RationalFunction<E> element) {
    return element != null;
  }

  @Override
  public Iterator<RationalFunction<E>> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public RationalFunction<E> zero() {
    return mZero;
  }

  private RationalFunction<E> constructInLowestTerms(final Polynomial<E> num, final Polynomial<E> den) {
    // todo this can apparently hang doing the gcd (at least for E = Z)
    // strictly speaking that might be ok, since Z is not a field
    //System.out.println("gcd " + num + ", " + den);
    final Polynomial<E> gcd = mPolyField.gcd(num, den);
    return new RationalFunction<>(mPolyField.divide(num, gcd), mPolyField.divide(den, gcd));
  }

  @Override
  public RationalFunction<E> add(final RationalFunction<E> a, final RationalFunction<E> b) {
    final Polynomial<E> num = mPolyField.add(mPolyField.multiply(a.left(), b.right()), mPolyField.multiply(b.left(), a.right()));
    final Polynomial<E> den = mPolyField.multiply(a.right(), b.right());
    return constructInLowestTerms(num, den);
  }

  @Override
  public RationalFunction<E> negate(final RationalFunction<E> a) {
    return new RationalFunction<>(mPolyField.negate(a.left()), a.right());
  }

  @Override
  public RationalFunction<E> one() {
    return mOne;
  }

  @Override
  public RationalFunction<E> multiply(final RationalFunction<E> a, final RationalFunction<E> b) {
    return constructInLowestTerms(mPolyField.multiply(a.left(), b.left()), mPolyField.multiply(a.right(), b.right()));
  }

  /**
   * Convenience method to multiply by an ordinary polynomial.
   * @param a rational function
   * @param b polynomial
   * @return product
   */
  public RationalFunction<E> multiply(final RationalFunction<E> a, final Polynomial<E> b) {
    return constructInLowestTerms(mPolyField.multiply(a.left(), b), a.right());
  }

  /**
   * Convenience method to multiply by a scalar.
   * @param a rational function
   * @param b scalar
   * @return product
   */
  public RationalFunction<E> multiply(final RationalFunction<E> a, final E b) {
    return constructInLowestTerms(mPolyField.multiply(a.left(), b), a.right());
  }

  @Override
  public RationalFunction<E> inverse(final RationalFunction<E> element) {
    return new RationalFunction<>(element.right(), element.left());
  }

  @Override
  public String toString() {
    return mElementField + "(" + x() + ")";
  }

  /**
   * The monic polynomial <code>x</code>.
   * @return the degree 1 polynomial <code>x</code>
   */
  public RationalFunction<E> x() {
    return mX;
  }

  /**
   * Return the derivative of a rational function.
   * @param p function to take derivative of
   * @return derivative
   */
  public RationalFunction<E> diff(final RationalFunction<E> p) {
    final Polynomial<E> num = mPolyField.subtract(
      mPolyField.multiply(p.right(), mPolyField.diff(p.left())),
      mPolyField.multiply(p.left(), mPolyField.diff(p.right())));
    final Polynomial<E> den = mPolyField.multiply(p.right(), p.right());
    return constructInLowestTerms(num, den);
  }

}
