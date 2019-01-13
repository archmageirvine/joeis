package irvine.oeis;

import irvine.math.api.Group;
import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * The number of elements of each order in a finite group.
 * @author Sean A. Irvine
 */
public class OrdersFiniteGroupSequence implements Sequence {

  private final DynamicLongArray mA = new DynamicLongArray();
  private int mN = 1;

  /**
   * Construct the sequence.
   * @param group the group to get counts for
   * @param <T> the type of the group
   */
  public <T> OrdersFiniteGroupSequence(final Group<T> group) {
    for (final T e : group) {
      final int order = group.order(e).intValueExact();
      mA.set(order, mA.get(order) + 1);
    }
  }

  @Override
  public Z next() {
    return mN < mA.length() ? Z.valueOf(mA.get(mN++)) : null;
  }
}

