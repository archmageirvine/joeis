package irvine.math.group;

import irvine.math.api.Field;
import irvine.math.api.Group;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Ring of integers under addition but with inexact division. While technically
 * not a field because the division is not exact, this class is often useful
 * in cases where we know the division will work or in cases where floors of
 * division is sufficient.
 * @author Sean A. Irvine
 */
public final class IntegerField extends Integers implements Field<Z> {

  /** Instance of ring of integers augmented with inexact division. */
  public static final IntegerField SINGLETON = new IntegerField();

  private IntegerField() { }

  @Override
  public Z inverse(final Z element) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Z divide(final Z n, final Z d) {
    return n.divide(d);
  }

  @Override
  public Group<Z> multiplicativeGroup() {
    throw new UnsupportedOperationException();
  }
}
