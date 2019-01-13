package irvine.math.group;

import java.util.Iterator;

import irvine.math.api.Field;
import irvine.math.z.Z;

/**
 * The group corresponding to the multiplicative operation of a field.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class MultiplicativeGroup<T> extends AbstractGroup<T> {

  private final Field<T> mParent;

  /**
   * Construct a new multiplicative group from the nonzero elements of a field.
   * @param parent field
   */
  public MultiplicativeGroup(final Field<T> parent) {
    if (parent == null) {
      throw new NullPointerException();
    }
    mParent = parent;
  }

  @Override
  public T zero() {
    return mParent.one();
  }

  @Override
  public Z size() {
    if (mParent.isInfinite()) {
      return null;
    }
    return mParent.size().subtract(1); // drop the 0
  }

  @Override
  public boolean isAbelian() {
    return true; // fields are always commutative
  }

  @Override
  public boolean contains(final T a) {
    return mParent.contains(a) && !mParent.zero().equals(a);
  }

  @Override
  public T add(final T a, final T b) {
    checkContains(a);
    checkContains(b);
    return mParent.multiply(a, b);
  }

  @Override
  public T negate(final T a) {
    checkContains(a);
    return mParent.inverse(a);
  }

  @Override
  public Iterator<T> iterator() {
    return new ZeroSkippingIterator<>(mParent.iterator(), mParent.zero());
  }

  @Override
  public String toString() {
    return "mult(" + mParent + ")";
  }
}
