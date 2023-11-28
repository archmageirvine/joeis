package irvine.oeis;

import irvine.math.api.Group;
import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * The number of elements of each order in a finite group.
 * @param <T> underlying element type
 * @author Sean A. Irvine
 */
public class OrdersFiniteGroupSequence<T> extends AbstractSequence {

  private static final int DEFOFF = 1;
  private final Group<T> mGroup;
  private DynamicLongArray mA = null;
  private int mN = 1;

  /**
   * Construct the sequence.
   * @param group the group to get counts for
   */
  public OrdersFiniteGroupSequence(final Group<T> group) {
    super(DEFOFF);
    mGroup = group;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new DynamicLongArray();
      for (final T e : mGroup) {
        mA.increment(mGroup.order(e).intValueExact());
      }
    }
    return mN < mA.length() ? Z.valueOf(mA.get(mN++)) : null;
  }
}

