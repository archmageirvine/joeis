package irvine.math.group;

import java.util.Iterator;

import irvine.math.api.Group;
import irvine.math.api.Set;
import irvine.math.set.AbstractSet;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * A left coset. In general this should only be accessed via the
 * <code>leftCoset</code> method of the corresponding group.  The
 * coset if backed by the given set and is not explicitly constructed.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
class LeftCoset<T> extends AbstractSet<T> {

  private final Group<T> mGroup;
  private final Set<T> mSet;
  private final T mElement;

  /**
   * Construct a new left coset from the specified set and element
   * within a group.
   * @param group the parent group
   * @param set the base of the coset
   * @param element the element of the coset
   */
  LeftCoset(final Group<T> group, final T element, final Set<T> set) {
    if (group == null || set == null) {
      throw new NullPointerException();
    }
    if (!group.contains(element)) {
      throw new IllegalArgumentException();
    }
    mGroup = group;
    mSet = set;
    mElement = element;
  }

  @Override
  public Z size() {
    return mSet.size();
  }

  @Override
  public boolean contains(final T a) {
    return mSet.contains(mGroup.subtract(mElement, a));
  }

  private static final class LeftCosetIterator<T> extends AbstractIterator<T> {

    private final Group<T> mGroup;
    private final Iterator<T> mParent;
    private final T mElement;

    private LeftCosetIterator(final Group<T> group, final Iterator<T> parent, final T element) {
      mGroup = group;
      mParent = parent;
      mElement = element;
    }

    @Override
    public boolean hasNext() {
      return mParent.hasNext();
    }

    @Override
    public T next() {
      return mGroup.add(mElement, mParent.next());
    }
  }

  @Override
  public Iterator<T> iterator() {
    return new LeftCosetIterator<>(mGroup, mSet.iterator(), mElement);
  }

  @Override
  public String toString() {
    return mElement + mSet.toString() + " in " + mGroup;
  }
}
