package irvine.oeis;

import irvine.math.api.Group;
import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * The number of elements of each order in a finite group.
 * @author Sean A. Irvine
 * @param <T> underlying element type
 */
public class OrdersFiniteGroupSequence<T> implements Sequence {

  private final Group<T> mGroup;
  private DynamicLongArray mA = null;
  private int mN = 1;

  /**
   * Construct the sequence.
   * @param group the group to get counts for
   * @param <T> the type of the group
   */
  public OrdersFiniteGroupSequence(final Group<T> group) {
    mGroup = group;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new DynamicLongArray();
      for (final T e : mGroup) {
        final int order = mGroup.order(e).intValueExact();
        mA.set(order, mA.get(order) + 1);
      }
    }
    return mN < mA.length() ? Z.valueOf(mA.get(mN++)) : null;
  }
}

