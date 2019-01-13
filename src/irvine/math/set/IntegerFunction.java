package irvine.math.set;

import irvine.math.api.Set;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A function from integers to integers.
 *
 * @author Sean A. Irvine
 */
public abstract class IntegerFunction extends AbstractFunction<Z, Z> {

  private final boolean mOnto;
  private final boolean mOneToOne;

  /**
   * A function on integers.
   * @param onto true if the function is onto
   * @param oneToOne true if the function is one-to-one
   */
  public IntegerFunction(final boolean onto, final boolean oneToOne) {
    super(Integers.SINGLETON, Integers.SINGLETON);
    mOnto = onto;
    mOneToOne = oneToOne;
  }

  @Override
  public abstract Z image(final Z x);

  @Override
  public Set<Z> image() {
    if (mOnto) {
      return Integers.SINGLETON;
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
