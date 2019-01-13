package irvine.math.set;

import irvine.math.api.Set;
import irvine.math.r.Reals;

/**
 * A function from reals to reals.
 *
 * @author Sean A. Irvine
 */
public abstract class RealFunction extends AbstractFunction<Double, Double> {

  private final boolean mOnto;
  private final boolean mOneToOne;

  /**
   * A function on reals.
   * @param onto true if the function is onto
   * @param oneToOne true if the function is one-to-one
   */
  public RealFunction(final boolean onto, final boolean oneToOne) {
    super(Reals.SINGLETON, Reals.SINGLETON);
    mOnto = onto;
    mOneToOne = oneToOne;
  }

  @Override
  public abstract Double image(final Double x);

  @Override
  public Set<Double> image() {
    if (mOnto) {
      return Reals.SINGLETON;
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isOnto() {
    return mOnto;
  }

  @Override
  public boolean isOneToOne() {
    return mOneToOne;
  }

}
