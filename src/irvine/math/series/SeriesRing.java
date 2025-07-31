package irvine.math.series;

import java.util.Collections;
import java.util.Iterator;

import irvine.math.api.Field;
import irvine.math.group.AbstractRing;
import irvine.math.group.IntegerField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A formal power series ring over an underlying field.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
public class SeriesRing<E> extends AbstractRing<Series<E>> {

  // todo at the moment underlying type could get away with ring, but for division later I think a field will be needed
  // todo "SeriesRing" might not be final name here, if I can get division working (Taylor series expansion)

  /** Formal power series ring over integers. */
  public static final SeriesRing<Z> SZ = new SeriesRing<>(IntegerField.SINGLETON);
  /** Formal power series ring over rationals. */
  public static final SeriesRing<Q> SQ = new SeriesRing<>(Rationals.SINGLETON);

  private final Field<E> mElementField;
  private final Series<E> mZero;
  private final Series<E> mOne;

  /**
   * Construct a ring of formal power series over a given field.
   * @param field underlying element field
   */
  public SeriesRing(final Field<E> field) {
    mElementField = field;
    mZero = new FiniteSeries<>(mElementField.zero(), Collections.emptyList());
    mOne = new FiniteSeries<>(mElementField.zero(), Collections.singletonList(mElementField.one()));
  }

  @Override
  public Series<E> zero() {
    return mZero;
  }

  @Override
  public Series<E> one() {
    return mOne;
  }

  @Override
  public boolean isCommutative() {
    return mElementField.isCommutative();
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final Series<E> element) {
    return element != null;
  }

  @Override
  public Series<E> negate(final Series<E> s) {
    return n -> mElementField.negate(s.coeff(n));
  }

  @Override
  public Series<E> add(final Series<E> a, final Series<E> b) {
    return new CachedSeries<>(n -> mElementField.add(a.coeff(n), b.coeff(n)));
  }

  @Override
  public Series<E> multiply(final Series<E> a, final Series<E> b) {
    return new CachedSeries<>(n -> mElementField.sum(0, n, k -> mElementField.multiply(a.coeff(k), b.coeff(n - k))));
  }

  /**
   * Return the derivative of a series.
   * @param s series to take derivative of
   * @return derivative
   */
  public Series<E> diff(final Series<E> s) {
    return n -> mElementField.multiply(s.coeff(n + 1), mElementField.coerce(n + 1));
  }

  @Override
  public Iterator<Series<E>> iterator() {
    // todo some kind of dovetail ?
    throw new UnsupportedOperationException();
  }

  // todo a/b

  // todo create methods (cf. existing Polynomial code and via FiniteSeries

  // todo toString() to some distance
}
