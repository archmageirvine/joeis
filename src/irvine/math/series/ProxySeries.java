package irvine.math.series;

/**
 * Wrap a series.
 * Typically used when a series needs to recursively refer to itself.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
public class ProxySeries<E> extends AbstractInfiniteSeries<E> {

  private Series<E> mS = null;

  @Override
  public E coeff(final long n) {
    return mS.coeff(n);
  }

  /**
   * The series wrapped by this series.
   * @param s series to wrap
   * @return this series
   */
  public Series<E> set(final Series<E> s) {
    mS = s;
    return this;
  }
}
