package irvine.math.group;

import java.util.Iterator;

import irvine.math.api.Group;
import irvine.math.z.Z;

/**
 * A centralizer for a parent group.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class Centralizer<T> extends AbstractGroup<T> {

  private final Group<T> mParent;
  private final T mElement;

  /**
   * Construct a new centralizer of the parent group using the explicitly given
   * set. It is assumed that the given set indeeds forms the elements of a
   * centralizer of the parent.
   * @param element base element for centralizer
   * @param parent parent group
   */
  public Centralizer(final Group<T> parent, final T element) {
    if (parent == null || element == null) {
      throw new NullPointerException();
    }
    mParent = parent;
    mElement = element;
  }

  @Override
  public T zero() {
    return mParent.zero();
  }

  private Z mCachedSize = null;

  @Override
  public Z size() {
    if (mParent.isInfinite()) {
      throw new UnsupportedOperationException();
    }
    if (mCachedSize == null) {
      Z c = Z.ZERO;
      for (final Iterator<T> it = iterator(); it.hasNext(); it.next()) {
        c = c.add(1);
      }
      mCachedSize = c;
    }
    return mCachedSize;
  }

  @Override
  public boolean isAbelian() {
    return true;
  }

  @Override
  public boolean contains(final T a) {
    return mParent.contains(a) && mParent.add(a, mElement).equals(mParent.add(mElement, a));
  }

  @Override
  public T add(final T a, final T b) {
    checkContains(a);
    checkContains(b);
    return mParent.add(a, b);
  }

  @Override
  public T negate(final T a) {
    checkContains(a);
    return mParent.negate(a);
  }

  @Override
  public Iterator<T> iterator() {
    return new SubgroupIterator<>(this, mParent.iterator());
  }

  @Override
  public String toString() {
    return "C(" + mParent + ")";
  }
}
