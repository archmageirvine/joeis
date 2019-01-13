package irvine.math.group;

import java.util.Iterator;

import irvine.math.api.Group;
import irvine.math.api.Set;
import irvine.math.z.Z;

/**
 * A centre for a parent group.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class Centre<T> extends AbstractGroup<T> {

  private final Group<T> mParent;
  private final Set<T> mElements;

  /**
   * Construct a new centre of the parent group using the explicitly given
   * set. It is assumed that the given set indeeds forms the elements of a
   * centre of the parent.
   * @param parent parent group
   * @param elements members of the centre
   */
  public Centre(final Group<T> parent, final Set<T> elements) {
    if (parent == null || elements == null) {
      throw new NullPointerException();
    }
    mParent = parent;
    mElements = elements;
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
    if (!mParent.contains(a)) {
      return false;
    }
    for (final T e : mElements) {
      if (!mParent.add(a, e).equals(mParent.add(e, a))) {
        return false;
      }
    }
    return true;
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
    return "Z(" + mParent + ")";
  }
}
